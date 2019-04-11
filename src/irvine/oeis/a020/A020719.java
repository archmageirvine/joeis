package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020719 <code>a(n) = n+7</code>.
 * @author Sean A. Irvine
 */
public class A020719 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020719() {
    super(new long[] {-1, 2}, new long[] {7, 8});
  }
}
