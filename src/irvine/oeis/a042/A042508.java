package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042508 Numerators of continued fraction convergents to <code>sqrt(782)</code>.
 * @author Sean A. Irvine
 */
public class A042508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042508() {
    super(new long[] {-1, 0, 0, 0, 1566, 0, 0, 0}, new long[] {27, 28, 755, 783, 43037, 43820, 1182357, 1226177});
  }
}
