package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271027 a(n) = 3661529 + 11184810*n.
 * @author Sean A. Irvine
 */
public class A271027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271027() {
    super(new long[] {-1, 2}, new long[] {3661529, 14846339});
  }
}
