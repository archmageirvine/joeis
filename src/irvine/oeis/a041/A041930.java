package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041930 Numerators of continued fraction convergents to sqrt(488).
 * @author Sean A. Irvine
 */
public class A041930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041930() {
    super(new long[] {-1, 0, 486, 0}, new long[] {22, 243, 10714, 118097});
  }
}
