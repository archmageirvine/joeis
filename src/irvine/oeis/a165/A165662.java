package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165662 Period 5: repeat <code>4,4,8,6,8</code>.
 * @author Sean A. Irvine
 */
public class A165662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165662() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {4, 4, 8, 6, 8});
  }
}
