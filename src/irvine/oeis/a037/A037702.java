package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037702 Base-4 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,3,0,2</code>.
 * @author Sean A. Irvine
 */
public class A037702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037702() {
    super(new long[] {-4, 1, 0, 0, 4}, new long[] {1, 7, 28, 114, 457});
  }
}
