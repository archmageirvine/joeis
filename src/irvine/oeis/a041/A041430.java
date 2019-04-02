package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041430 Numerators of continued fraction convergents to sqrt(231).
 * @author Sean A. Irvine
 */
public class A041430 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041430() {
    super(new long[] {-1, 0, 152, 0}, new long[] {15, 76, 2295, 11551});
  }
}
