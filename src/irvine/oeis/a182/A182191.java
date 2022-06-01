package irvine.oeis.a182;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A182191 a(n) = 6*a(n-1) - a(n-2) + 12 with n&gt;1, a(0)=-1, a(1)=5.
 * @author Sean A. Irvine
 */
public class A182191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182191() {
    super(new long[] {1, -7, 7}, new long[] {-1, 5, 43});
  }
}
