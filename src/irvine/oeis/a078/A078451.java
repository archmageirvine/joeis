package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A078451 a(1)=1, a(n) = ceiling(n/a(a(n-1))).
 * @author Sean A. Irvine
 */
public class A078451 extends CachedSequence {

  /** Construct the sequence. */
  public A078451() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      } else {
        final Z t = self.a(self.a(n - 1));
        return t.add(n - 1).divide(t);
      }
    });
  }
}

