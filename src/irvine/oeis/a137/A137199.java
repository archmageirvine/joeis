package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137199 a(n)=a(n-1)+3a(n-2)+a(n-3).
 * @author Sean A. Irvine
 */
public class A137199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137199() {
    super(new long[] {1, 3, 1}, new long[] {1, 1, 1});
  }
}
