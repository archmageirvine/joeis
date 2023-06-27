package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180250 a(n) = 5*a(n-1) + 10*a(n-2), with a(1)=0 and a(2)=1.
 * @author Sean A. Irvine
 */
public class A180250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180250() {
    super(1, new long[] {10, 5}, new long[] {0, 1});
  }
}
