package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154346 <code>a(n) = 12*a(n-1) - 28*a(n-2)</code> for <code>n&gt;1</code>, with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A154346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154346() {
    super(new long[] {-28, 12}, new long[] {1, 12});
  }
}
