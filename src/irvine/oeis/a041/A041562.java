package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041562 Numerators of continued fraction convergents to <code>sqrt(299)</code>.
 * @author Sean A. Irvine
 */
public class A041562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041562() {
    super(new long[] {-1, 0, 0, 0, 830, 0, 0, 0}, new long[] {17, 52, 121, 415, 14231, 43108, 100447, 344449});
  }
}
