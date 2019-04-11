package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085447 <code>a(n) = 6*a(n-1) + a(n-2),</code> starting with <code>a(0)=2</code> and <code>a(1)=6</code>.
 * @author Sean A. Irvine
 */
public class A085447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085447() {
    super(new long[] {1, 6}, new long[] {2, 6});
  }
}
