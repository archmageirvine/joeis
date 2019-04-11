package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129975 Nonnegative values x of solutions <code>(x,</code> y) to the Diophantine equation <code>x^2+(x+953)^2 =</code> y^2.
 * @author Sean A. Irvine
 */
public class A129975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129975() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 132, 2295, 2859, 3535, 15792, 19060});
  }
}
