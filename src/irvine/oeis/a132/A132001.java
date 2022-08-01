package irvine.oeis.a132;
// manually mult at 2022-07-31 10:58

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A132001 Expansion of 1 - (1/3) * b(q) * b(q^2) * c(q)^2 / c(q^2) in powers of q where b(), c() are cubic AGM functions.
 * a(n) is multiplicative with a(2^e) = 2 + ((-4)^(e+1) - 1)/5, a(3^e) = 1, a(p^e) = (q^(e+1) - 1) / (q - 1) where q = p^2 * Kronecker(-3, p) if p &gt; 3.
 * @author Georg Fischer
 */
public class A132001 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A132001() {
    super(1, (p, e) -> {
      if (p.equals(Z.TWO)) {
        return Z.TWO.add(Z.valueOf(-4).pow(e + 1).subtract(1).divide(5));
      } else if (p.equals(Z.THREE)) {
        return Z.ONE;
      } else {
        final Z q = p.square().multiply(LongUtils.kronecker(-3, p.longValue()));
        return q.pow(e + 1).subtract(1).divide(q.subtract(1));
      }
    });
  }
}
