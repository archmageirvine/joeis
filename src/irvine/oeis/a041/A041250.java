package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041250 Numerators of continued fraction convergents to sqrt(137).
 * @author Sean A. Irvine
 */
public class A041250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041250() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 3488, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {11, 12, 35, 82, 117, 199, 515, 1229, 1744, 39597, 41341, 122279, 285899, 408178, 694077, 1796332, 4286741, 6083073});
  }
}
