package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057819 a(0)=4, a(1)=9, a(n) = 4a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A057819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057819() {
    super(new long[] {-1, 4}, new long[] {4, 9});
  }
}
