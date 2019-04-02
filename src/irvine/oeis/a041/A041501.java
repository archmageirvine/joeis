package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041501 Denominators of continued fraction convergents to sqrt(267).
 * @author Sean A. Irvine
 */
public class A041501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041501() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 4804, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 47, 50, 147, 4754, 9655, 14409, 225790, 240199, 706188});
  }
}
