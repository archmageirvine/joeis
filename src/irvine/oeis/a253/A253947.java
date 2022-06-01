package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253947 a(n) = 6*binomial(n+1,7).
 * @author Sean A. Irvine
 */
public class A253947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253947() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {6, 48, 216, 720, 1980, 4752, 10296, 20592});
  }
}
