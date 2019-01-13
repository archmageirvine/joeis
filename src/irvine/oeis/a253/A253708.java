package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253708.
 * @author Sean A. Irvine
 */
public class A253708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253708() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {323, 7497, 57618, 262430, 878445, 2399103, 5669972});
  }
}
