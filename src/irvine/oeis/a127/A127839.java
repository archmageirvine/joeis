package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127839 a(1)=1, a(2)=...=a(5)=0, a(n) = a(n-5) + a(n-4) for n &gt; 5.
 * @author Sean A. Irvine
 */
public class A127839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127839() {
    super(new long[] {1, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 0});
  }
}
