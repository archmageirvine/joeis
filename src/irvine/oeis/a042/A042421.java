package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042421 Denominators of continued fraction convergents to sqrt(738).
 * @author Sean A. Irvine
 */
public class A042421 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042421() {
    super(new long[] {-1, 0, 326, 0}, new long[] {1, 6, 325, 1956});
  }
}
