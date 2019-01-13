package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168675.
 * @author Sean A. Irvine
 */
public class A168675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168675() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 384, 13122, 163840, 1171875, 5878656, 23059204, 75497472, 215233605});
  }
}
