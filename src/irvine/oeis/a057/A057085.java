package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057085 <code>a(0)=0, a(1)=1</code>; for <code>n&gt;1, a(n) = 9a(n-1) - 9a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A057085 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057085() {
    super(new long[] {-9, 9}, new long[] {0, 1});
  }
}
