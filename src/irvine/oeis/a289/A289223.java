package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289223.
 * @author Sean A. Irvine
 */
public class A289223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289223() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 12, 66, 204});
  }
}
