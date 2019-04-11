package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114047 x such that <code>x^2 -</code> 13*y^2 <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A114047 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114047() {
    super(new long[] {-1, 1298}, new long[] {1, 649});
  }
}
