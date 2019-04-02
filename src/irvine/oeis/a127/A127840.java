package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127840 a(1)=1, a(2)=...=a(6)=0, a(n) = a(n-6)+a(n-5) for n&gt;6.
 * @author Sean A. Irvine
 */
public class A127840 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127840() {
    super(new long[] {1, 1, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0});
  }
}
