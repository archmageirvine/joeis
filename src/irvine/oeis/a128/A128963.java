package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128963 a(n) = (n^3 - n)*5^n.
 * @author Sean A. Irvine
 */
public class A128963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128963() {
    super(new long[] {-625, 500, -150, 20}, new long[] {0, 150, 3000, 37500});
  }
}
