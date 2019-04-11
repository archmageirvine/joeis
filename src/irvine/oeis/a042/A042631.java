package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042631 Denominators of continued fraction convergents to <code>sqrt(845)</code>.
 * @author Sean A. Irvine
 */
public class A042631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042631() {
    super(new long[] {1, 0, 0, 0, 0, 24476, 0, 0, 0, 0}, new long[] {1, 14, 15, 29, 421, 24447, 342679, 367126, 709805, 10304396});
  }
}
