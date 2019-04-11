package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041252 Numerators of continued fraction convergents to <code>sqrt(138)</code>.
 * @author Sean A. Irvine
 */
public class A041252 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041252() {
    super(new long[] {-1, 0, 0, 0, 94, 0, 0, 0}, new long[] {11, 12, 35, 47, 1069, 1116, 3301, 4417});
  }
}
