package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252769.
 * @author Sean A. Irvine
 */
public class A252769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252769() {
    super(new long[] {1, -63, 63}, new long[] {94, 5908, 366282});
  }
}
