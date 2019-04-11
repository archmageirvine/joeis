package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128013 <code>a(n) = (n^3 +n)*5^n</code>.
 * @author Sean A. Irvine
 */
public class A128013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128013() {
    super(new long[] {-625, 500, -150, 20}, new long[] {10, 250, 3750, 42500});
  }
}
