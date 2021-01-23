package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137212 a(n)=5a(n-1)-5a(n-2)-3a(n-3).
 * @author Sean A. Irvine
 */
public class A137212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137212() {
    super(new long[] {-3, -5, 5}, new long[] {0, 0, 1});
  }
}
