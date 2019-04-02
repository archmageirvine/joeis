package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128802 a(n) = n*(n-1)*8^n.
 * @author Sean A. Irvine
 */
public class A128802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128802() {
    super(new long[] {512, -192, 24}, new long[] {0, 0, 128});
  }
}
