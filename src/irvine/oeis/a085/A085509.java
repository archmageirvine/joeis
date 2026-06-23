package irvine.oeis.a085;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A085509 Numbers containing no zero digits in bases 3 to 10.
 * @author Sean A. Irvine
 */
public class A085509 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085509() {
    super(1, n -> {
      for (int b = 3; b <= 10; ++b) {
        if (ZUtils.digitCounts(n, b)[0] > 0) {
          return false;
        }
      }
      return true;
    });
  }
}
