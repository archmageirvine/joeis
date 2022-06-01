package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180167 a(0) = 1, a(1) = 7; a(n)= 6*a(n-1) + 6*a(n-2) for n&gt;1.
 * @author Sean A. Irvine
 */
public class A180167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180167() {
    super(new long[] {6, 6}, new long[] {1, 7});
  }
}
