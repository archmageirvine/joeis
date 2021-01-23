package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016947 a(n) = (6*n + 3)^3.
 * @author Sean A. Irvine
 */
public class A016947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016947() {
    super(new long[] {-1, 4, -6, 4}, new long[] {27, 729, 3375, 9261});
  }
}
