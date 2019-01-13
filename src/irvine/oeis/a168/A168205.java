package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168205.
 * @author Sean A. Irvine
 */
public class A168205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168205() {
    super(new long[] {-1, 1, 1}, new long[] {2, 7, 6});
  }
}
