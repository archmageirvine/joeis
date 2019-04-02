package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041291 Denominators of continued fraction convergents to sqrt(158).
 * @author Sean A. Irvine
 */
public class A041291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041291() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 15486, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 7, 86, 265, 351, 616, 15135, 15751, 30886, 108409, 1331794, 4103791, 5435585, 9539376});
  }
}
