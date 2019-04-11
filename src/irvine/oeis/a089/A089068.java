package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089068 <code>a(n) = a(n-1)+a(n-2)+a(n-3)+2</code> with <code>a(0)=0, a(1)=0</code> and <code>a(2)=1</code>.
 * @author Sean A. Irvine
 */
public class A089068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089068() {
    super(new long[] {-1, 0, 0, 2}, new long[] {0, 0, 1, 3});
  }
}
