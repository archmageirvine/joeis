package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275636 a(n) = (3^n-1)*(3^n+3)/3!.
 * @author Sean A. Irvine
 */
public class A275636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275636() {
    super(new long[] {27, -39, 13}, new long[] {0, 2, 16});
  }
}
