package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156719.
 * @author Sean A. Irvine
 */
public class A156719 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156719() {
    super(new long[] {1, -3, 3}, new long[] {45, 350, 943});
  }
}
