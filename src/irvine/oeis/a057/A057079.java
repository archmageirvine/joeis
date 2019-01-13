package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057079.
 * @author Sean A. Irvine
 */
public class A057079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057079() {
    super(new long[] {-1, 1}, new long[] {1, 2});
  }
}
