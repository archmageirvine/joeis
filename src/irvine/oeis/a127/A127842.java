package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127842 <code>a(1)=1, a(2)=</code>...=a(8)=0, <code>a(n) = a(n-8)+a(n-7)</code> for <code>n&gt;8</code>.
 * @author Sean A. Irvine
 */
public class A127842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127842() {
    super(new long[] {1, 1, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 0});
  }
}
