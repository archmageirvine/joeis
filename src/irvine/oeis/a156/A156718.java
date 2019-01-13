package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156718.
 * @author Sean A. Irvine
 */
public class A156718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156718() {
    super(new long[] {-1, 1, 1}, new long[] {70, 99, 239});
  }
}
