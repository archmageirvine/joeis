package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242563 a(n) = 2*a(n-1) - a(n-3) + 2*a(n-4), a(0)=a(1)=0, a(2)=2, a(3)=3.
 * @author Sean A. Irvine
 */
public class A242563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242563() {
    super(new long[] {2, -1, 0, 2}, new long[] {0, 0, 2, 3});
  }
}
