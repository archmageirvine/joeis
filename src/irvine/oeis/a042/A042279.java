package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042279 Denominators of continued fraction convergents to sqrt(665).
 * @author Sean A. Irvine
 */
public class A042279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042279() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 27438, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 4, 5, 14, 33, 80, 113, 419, 532, 27019, 27551, 109672, 137223, 384118, 905459, 2195036, 3100495, 11496521, 14597016});
  }
}
