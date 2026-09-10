package irvine.oeis.a086;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A086521 Number of tandem duplication trees on n duplicated gene segments.
 * @author Sean A. Irvine
 */
public class A086521 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A086521() {
    super(2, new CachedSequence(2, Long.class, (self, n) -> {
      if (n <= 3) {
        return Z.TWO;
      }
      return Integers.SINGLETON.sum(1, (n + 1) / 3, k -> Binomial.binomial(n + 1 - 2 * k, k).multiply(self.a(n - k)).multiply(Z.NEG_ONE.pow(k + 1)));
    }), Z::divide2);
  }
}
