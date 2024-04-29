package irvine.oeis.a104;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A104725 Number of complementing systems of subsets of {0, 1, ..., n-1}.
 * Maple program rewritten in Java.
 * Offset 0;
 * DATA 0, 1, 1, 1, 2, 1, 3, 1, 5, 2, 3, 1, 11, 1, 3, 3, 15, 1, 11, 1, 11, 3, 3, 1, 45 ...
 * @author Georg Fischer
 */
/*
The Maple program:
  with(combinat): 
  a:=proc(n::integer) local u, r, i, j, k; 
    if n < 1 then return 0; elif n = 1 then return 1; end if; 
    u := map(x->x[2], ifactors(n)[2]); # u are the exponents
    r := add(u[i], i=1..nops(u)); # sum of exponents
    add(
        add((-1)^i * binomial(k, i) * product(binomial(u[j]+k-i-1, u[j]), j=1..nops(u))
           , i=0..k-1
           ) * bell(k-1)
       , k=1..r
       ); 
  end proc: 
  seq(a(n), n=0..90);
*/
public class A104725 extends Sequence0 {

  private int mN = -1; // offset 0

  @Override
  public Z next() {
    ++mN;
    if (mN < 1) {
      return Z.ZERO;
    } else if (mN == 1) {
      return Z.ONE;
    } 
    final FactorSequence fs = Jaguar.factor(mN);
    int r = 0; // becomes sum of exponents
    final Z[] ps = fs.toZArray();
    final int[] u = new int[ps.length]; // array of exponents
    int iexp = 0;
    for (final Z p : ps) {
      final int exp = fs.getExponent(p);
      r += exp;
      u[iexp++] = exp;
    } // 
    
    Z sumK = Z.ZERO;
    for (int k = 1; k <= r; ++k) {
      Z sumI = Z.ZERO;
      for (int i = 0; i < k; ++i) {
        Z prodJ = Z.ONE;
        for (final int value : u) {
          prodJ = prodJ.multiply(Binomial.binomial(value + k - i - 1, value));
        } // for j
        final Z term = Binomial.binomial(k, i).multiply(prodJ);
        sumI = (i & 1) == 0 ? sumI.add(term) : sumI.subtract(term);
      } // for i
      sumK = sumK.add(sumI.multiply(Functions.BELL.z(k - 1)));
    } // for k
    return sumK;
  }
}
