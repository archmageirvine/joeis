package irvine.oeis;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Coordination sequence for a lattice of some type (A, B, C and so on) and order <code>n</code>,
 * which is realized by a recurrence. The signature are the
 * coefficients of <code>(1-x)^n</code>, and the initial terms are computed by a sum
 * of expressions of <code>binomial(n,k)</code>, depending on the type.
 * @author Georg Fischer
 */
public class LatticeCoordinationSequence extends GeneratingFunctionSequence {

  /**
   * Construct the sequence by reducing it to a ordinary generating function.
   * The constructor computation is close to the sequence definition
   * and not optimized for speed.
   * @param latticeType A, B, C, D* and so on.
   * @param n order of the lattice
   */
  public LatticeCoordinationSequence(final String latticeType, final int n) {
    super();
    configure(latticeType, n);
  }

  /**
   * Compute the numerator and denominator coefficient lists.
   * @param latticeType A, B, C, Ds and so on.
   * @param n order
   */
  protected void configure(final String latticeType, final int n) {
    char typeCode = latticeType.charAt(0);
    if (latticeType.length() > 1) { // Dual: "A*" or "Ds" ...
      typeCode = Character.toLowerCase(typeCode);
    }
    mNum = new Z[n + 1];
    for (int k = 0; k <= n; ++k) {
      Z coeff;
      switch (typeCode) {
        case 'A':
          //  A, A103881
          //  n:= 4; CoefficientList[Series[Sum[(Binomial[n,k])^2*x^k, {k, 0, n}]/(1 - x)^n, {x,0,11}],x]
          //  {1, 20, 110, 340, 780, 1500, 2570, 4060, 6040, 8580, 11750, 15620}
          coeff = binomial(n, k).pow(2);
          break;
        case 'a':
          //  A*, A008535 (A204621 = coordinator triangle)
          //  n:=7; CoefficientList[Series[((Sum[Sum[Binomial[n+1, j] , {j, 0, Min[k, n-k]}]*x^k, {k, 0, n}])/(1-x)^n),{x,0,10}],x]
          //  {1, 16, 128, 688, 2746, 8752, 23536, 55568, 118498, 232976, 428752}
          Z sumj = Z.ZERO;
          final int mink = Math.min(k, n - k);
          for (int j = 0; j <= mink; ++j) {
            sumj = sumj.add(binomial(n + 1, j));
          } // for j
          coeff = sumj;
          break;
        case 'B':
          //  B, A103883
          //  n:= 4; CoefficientList[Series[(Sum[(Binomial[2n + 1, 2k] - 2*k*Binomial[n, k])*x^k, {k, 0, n}])/(1 - x)^n, {x,0,11}],x]
          //  {1, 32, 224, 768, 1856, 3680, 6432, 10304, 15488, 22176, 30560, 40832}
          coeff = binomial(2L * n + 1, 2L * k).subtract(Z.valueOf(2L * k).multiply(binomial(n, k)));
          break;
        case 'C':
          //  C, A103884
          //  n:= 4; CoefficientList[Series[(Sum[Binomial[2n,2k]*x^k, {k, 0, n}])/(1-x)^n, {x,0,11}],x]
          //  {1, 32, 192, 608, 1408, 2720, 4672, 7392, 11008, 15648, 21440, 28512}
          coeff = binomial(2L * n, 2L * k);
          break;
        case 'D':
          //  D, A103903
          //  n:= 4; CoefficientList[Series[(Sum[(Binomial[2n,2k]-2*n*Binomial[n-2,k-1])*x^k, {k, 0, n}])/(1-x)^n, {x,0,11}],x]
          //  {1, 24, 144, 456, 1056, 2040, 3504, 5544, 8256, 11736, 16080, 21384}
          coeff = binomial(2L * n, 2L * k).subtract(Z.valueOf(2L * n).multiply(binomial(n - 2, k - 1)));
          break;
        case 'd':
          //  D*, A035706
          //  n:= 12; CoefficientList[Series[(Sum[Binomial[n,k]*x^k, {k, 0, n}] + 2^n*x^(n/2))/(1 - x)^n, {x,0,11}],x]
          //  {1, 24, 288, 2312, 14016, 68664, 288096, 1071912, 3600768, 11036504, 31125408, 81412680}
          coeff = binomial(n, k);
          if (k == n / 2) {
            coeff = coeff.add(Z.TWO.pow(n));
          }
          break;
        case 'Q':
          //  Q, A035706
          //  n:= 11; CoefficientList[Series[Sum[Binomial[n,k]*x^k, {k, 0, n}]/(1 - x)^n, {x,0,11}],x]
          //  {1, 22, 242, 1782, 9922, 44726, 170610, 568150, 1690370, 4573910, 11414898, 26572086}
          coeff = binomial(n, k);
          break;
        default:
          throw new RuntimeException("Unexpected typeCode " + typeCode);
      } // switch typeCode
      mNum[k] = coeff;
    }

    mDen = new Z[n + 1];
    for (int k = 0; k <= n; ++k) {
      Z coeff = binomial(n, k);
      if ((k & 1) == 1) { // odd
        coeff = coeff.negate();
      }
      mDen[k] = coeff;
    }
  }

  /**
   * Binomial coefficients: variant which agrees with Maple and Mathematica for k &lt;= n.
   * Cf. M.J. Kronenburg: "<a href="https://arxiv.org/pdf/1105.3689.pdf">The Binomial Coefficient for Negative Arguments</a>", Mar 30 2015
   * and Wolfram, <a href="https://mathworld.wolfram.com/BinomialCoefficient.html">Binomial Coefficient</a>
   * @param n upper index
   * @param k lower index
   * @return coefficient
   */
  public static Z binomial(final long n, final long k) {
    Z result = Binomial.binomial(n, k);
    if (k < 0 && n < 0) {
      result = Binomial.binomial(-k - 1, n - k);
      if (-k % 2 != -n % 2) {
        result = result.negate();
      }
    }
    return result;
  }
}
