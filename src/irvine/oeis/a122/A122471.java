package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122471 <code>a(n)=7*a(n-1)-n</code> for n&gt; <code>0, a(0)=1</code>.
 * @author Sean A. Irvine
 */
public class A122471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122471() {
    super(new long[] {7, -15, 9}, new long[] {1, 6, 40});
  }
}
