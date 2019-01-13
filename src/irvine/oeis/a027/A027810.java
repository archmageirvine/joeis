package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027810.
 * @author Sean A. Irvine
 */
public class A027810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027810() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 12, 63, 224, 630, 1512, 3234});
  }
}
