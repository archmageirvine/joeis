package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168566.
 * @author Sean A. Irvine
 */
public class A168566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168566() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 8, 35, 99, 224});
  }
}
