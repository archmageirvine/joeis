package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083420 <code>a(n) = 2*4^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A083420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083420() {
    super(new long[] {-4, 5}, new long[] {1, 7});
  }
}
