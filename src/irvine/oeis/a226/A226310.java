package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226310 <code>a(n+5) = a(n+4)+a(n+3)+a(n+2)+a(n+1)+2*a(n)</code> with <code>a(0)=0, a(1)=a(2)=a(3)=a(4)=1</code>.
 * @author Sean A. Irvine
 */
public class A226310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226310() {
    super(new long[] {2, 1, 1, 1, 1}, new long[] {0, 1, 1, 1, 1});
  }
}
