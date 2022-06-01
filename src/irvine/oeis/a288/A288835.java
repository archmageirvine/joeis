package irvine.oeis.a288;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A288835 a(n) = (1/2!)*3^n*(n+3)*(n).
 * @author Sean A. Irvine
 */
public class A288835 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288835() {
    super(new long[] {27, -27, 9}, new long[] {6, 45, 243});
  }
}
