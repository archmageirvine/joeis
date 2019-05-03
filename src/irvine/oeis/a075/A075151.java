package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075151 <code>a(n)=L(n)^2*C(n), L(n)=Lucas</code> numbers <code>(A000032), C(n)=reflected</code> Lucas numbers (comment to <code>A061084)</code>.
 * @author Sean A. Irvine
 */
public class A075151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075151() {
    super(new long[] {-1, 3, 6, -3}, new long[] {8, -1, 27, -64});
  }
}
