package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127841 a(1)=1, a(2)=...=a(7)=0, a(n) = a(n-7)+a(n-6) for n&gt;7.
 * @author Sean A. Irvine
 */
public class A127841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127841() {
    super(1, new long[] {1, 1, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0});
  }
}
