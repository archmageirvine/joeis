package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261150 a(n) = 403185216600637 + (n-1)*2124513401010.
 * @author Sean A. Irvine
 */
public class A261150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261150() {
    super(1, new long[] {-1, 2}, new long[] {403185216600637L, 405309730001647L});
  }
}
