package irvine.oeis.a045;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A045981 Describe all the previous terms! Version 1: term by term.
 * @author Sean A. Irvine
 */
public class A045981 extends CachedSequence {

  /** Construct the sequence. */
  public A045981() {
    super(1, Long.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      final StringBuilder sb = new StringBuilder();
      for (int k = 1; k < n; ++k) {
        sb.append(Functions.LOOK_AND_SAY.z(new Z(self.a(k).toString())));
      }
      return new Z(sb);
    });
  }
}
