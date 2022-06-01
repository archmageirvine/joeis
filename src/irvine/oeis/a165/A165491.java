package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165491 a(0)=1, a(1)=6, a(n) = 30*a(n-2) - a(n-1).
 * @author Sean A. Irvine
 */
public class A165491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165491() {
    super(new long[] {30, -1}, new long[] {1, 6});
  }
}
