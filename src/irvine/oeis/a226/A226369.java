package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226369.
 * @author Sean A. Irvine
 */
public class A226369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226369() {
    super(new long[] {2, 1, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 1});
  }
}
