package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042766 Numerators of continued fraction convergents to sqrt(914).
 * @author Sean A. Irvine
 */
public class A042766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042766() {
    super(new long[] {1, 0, 0, 0, 0, 11186, 0, 0, 0, 0}, new long[] {30, 121, 393, 1300, 5593, 336880, 1353113, 4396219, 14541770, 62563299});
  }
}
