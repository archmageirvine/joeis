package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135583 <code>a(n) = 4*a(n-1) - 4</code> for <code>n&gt;0, a(0)=3</code>.
 * @author Sean A. Irvine
 */
public class A135583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135583() {
    super(new long[] {-4, 5}, new long[] {3, 8});
  }
}
