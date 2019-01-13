package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168409.
 * @author Sean A. Irvine
 */
public class A168409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168409() {
    super(new long[] {-1, 1, 1}, new long[] {8, 8, 17});
  }
}
