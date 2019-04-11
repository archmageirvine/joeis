package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041842 Numerators of continued fraction convergents to <code>sqrt(443)</code>.
 * @author Sean A. Irvine
 */
public class A041842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041842() {
    super(new long[] {-1, 0, 884, 0}, new long[] {21, 442, 18585, 390727});
  }
}
