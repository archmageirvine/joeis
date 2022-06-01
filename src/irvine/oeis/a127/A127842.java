package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127842 a(1)=1, a(2)=...=a(8)=0, a(n) = a(n-8)+a(n-7) for n&gt;8.
 * @author Sean A. Irvine
 */
public class A127842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127842() {
    super(new long[] {1, 1, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 0});
  }
}
