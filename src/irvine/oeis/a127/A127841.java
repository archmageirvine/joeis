package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127841 <code>a(1)=1, a(2)=</code>...=a(7)=0, <code>a(n) = a(n-7)+a(n-6)</code> for <code>n&gt;7</code>.
 * @author Sean A. Irvine
 */
public class A127841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127841() {
    super(new long[] {1, 1, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0});
  }
}
