package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083880 <code>a(0)=1, a(1)=5, a(n)=10a(n-1)-23a(n-2), n&gt;=2</code>.
 * @author Sean A. Irvine
 */
public class A083880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083880() {
    super(new long[] {-23, 10}, new long[] {1, 5});
  }
}
