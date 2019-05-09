package irvine.oeis;

import irvine.math.z.Z;

/**
 * Special generating functions for Coxeter group sequences.
 * @author Georg Fischer
 */
public class CoxeterSequence extends GeneratingFunctionSequence {

  /**
   * Construct the specified generating function.
   * @param num coefficients of the numerator   polynomial
   * @param den coefficients of the denominator polynomial
   */
  public CoxeterSequence(final long[] num, final long[] den) {
    super(num, den);
  }

  /**
   * Constructor for a Coxeter group sequence.
   * This corresponds with the Mathematica routine <code>coxG</code>
   * defined in OEIS <a href="https://oeis.org/A169452">A169452</a>:
   * <pre>
   * coxG[{pwr_, c1_, c2_, trms_:20}]:=Module[{
   * num=Total[2t^Range[pwr-1]]+t^pwr+ 1,
   * den=Total[c2*t^Range[pwr-1]]+c1*t^pwr+1},
   * CoefficientList[ Series[ num/den, {t, 0, trms}], t]];
   * coxG[{33, 15, -5, 30}]
   *
   * G.f.: (t^33 + 2*t^32 + 2*t^31 + 2*t^30 + 2*t^29 + 2*t^28 + 2*t^27 + 2*t^26
   * + 2*t^25 + 2*t^24 + 2*t^23 + 2*t^22 + 2*t^21 + 2*t^20 + 2*t^19 + 2*t^18
   * + 2*t^17 + 2*t^16 + 2*t^15 + 2*t^14 + 2*t^13 + 2*t^12 + 2*t^11 + 2*t^10
   * + 2*t^9 + 2*t^8 + 2*t^7 + 2*t^6 + 2*t^5 + 2*t^4 + 2*t^3 + 2*t^2 + 2*t + 1)/
   * (15*t^33 - 5*t^32 - 5*t^31 - 5*t^30 - 5*t^29 - 5*t^28 - 5*t^27 - 5*t^26
   * - 5*t^25 - 5*t^24 - 5*t^23 - 5*t^22 - 5*t^21 - 5*t^20 - 5*t^19 - 5*t^18
   * - 5*t^17 - 5*t^16 - 5*t^15 - 5*t^14 - 5*t^13 - 5*t^12 - 5*t^11 - 5*t^10
   * - 5*t^9 - 5*t^8 - 5*t^7 - 5*t^6 - 5*t^5 - 5*t^4 - 5*t^3 - 5*t^2 - 5*t + 1).
   * </pre>
   * @param pwr largest exponent in the g.f. and of <code>(S_i S_j)</code> in the name,
   * @param c1 first coefficient in the denominator of the g.f.,
   * <code>= triangular(-c2) = binomial(-c2 + 1, 2)</code>
   * @param c2 second coefficient in the denominator of the g.f.,
   * = 2 - (numbers of generators in the name)
   */
  public CoxeterSequence(final int pwr, final int c1, final int c2) {
    super();
    mNum = new Z[pwr + 1];
    mDen = new Z[pwr + 1];
    mNum[pwr] = Z.ONE;
    mNum[0] = Z.ONE;
    mDen[pwr] = Z.valueOf(c1);
    mDen[0] = Z.ONE;
    int ipwr = pwr - 1;
    while (ipwr > 0) {
      mNum[ipwr] = Z.TWO;
      mDen[ipwr] = Z.valueOf(c2);
      --ipwr;
    } // while ipwr
  }

  /**
   * Constructor with power and number of generators
   * This version has simpler parameters which are directly deducible
   * from the name of the OEIS sequence.
   * @param pwr the exponent
   * @param ngen number of generators
   */
  public CoxeterSequence(final int pwr, final int ngen) {
    this(pwr, triangular(ngen), 2 - ngen);
  }

  /**
   * Returns a triangular number
   * @param ngen number of generators
   * @return <code>binomial(ngen + 1, 2)</code>
   */
  private static int triangular(final int ngen) {
    int result = 0;
    // A000217 Triangular numbers: a(n) = binomial(n+1, 2)
    // 0  1  2  3   4   5   6   7   8   9  10
    // 0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55
    int itri = ngen - 2;
    while (itri >= 1) {
      result += itri;
      --itri;
    } // while itri
    return result;
  } // triangular
}
