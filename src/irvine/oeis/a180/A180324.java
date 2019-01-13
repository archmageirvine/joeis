package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180324.
 * @author Sean A. Irvine
 */
public class A180324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180324() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 3, 25, 98, 270});
  }
}
