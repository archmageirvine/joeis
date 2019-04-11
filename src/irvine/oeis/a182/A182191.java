package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182191 <code>a(n) = 6*a(n-1) - a(n-2) + 12</code> with <code>n&gt;1, a(0)=-1, a(1)=5</code>.
 * @author Sean A. Irvine
 */
public class A182191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182191() {
    super(new long[] {1, -7, 7}, new long[] {-1, 5, 43});
  }
}
