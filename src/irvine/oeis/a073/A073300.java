package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A073300 If n=pqr...st in ternary, a(n)=value of the continuant [p,q,r,...,s,t].
 * @author Sean A. Irvine
 */
public class A073300 extends CachedSequence {

  /** Construct the sequence. */
  public A073300() {
    super(0, Integer.class, (self, n) -> {
      if (n == 0) {
        return Z.ONE;
      }
      if (n < 3) {
        return Z.valueOf(n);
      }
      return self.a(n / 3).multiply(n % 3).add(self.a(n / 9));
    });
  }
}

