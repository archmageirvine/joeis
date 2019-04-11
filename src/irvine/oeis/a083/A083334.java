package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083334 <code>a(n) = 12*a(n-2) - 25*a(n-4)</code>.
 * @author Sean A. Irvine
 */
public class A083334 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083334() {
    super(new long[] {-25, 0, 12, 0}, new long[] {1, 6, 17, 47});
  }
}
