package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101091 Fourth partial sums of fourth powers <code>(A000583)</code>.
 * @author Sean A. Irvine
 */
public class A101091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101091() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 20, 155, 760, 2814, 8592, 22770, 54120, 117975});
  }
}
