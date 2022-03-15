package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155629 a(n) = 8^n-4^n+1^n.
 * @author Sean A. Irvine
 */
public class A155629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155629() {
    super(new long[] {32, -44, 13}, new long[] {1, 5, 49});
  }
}
