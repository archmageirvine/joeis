package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042644 Numerators of continued fraction convergents to <code>sqrt(852)</code>.
 * @author Sean A. Irvine
 */
public class A042644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042644() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 388798, 0, 0, 0, 0, 0, 0, 0}, new long[] {29, 146, 467, 1080, 4787, 10654, 36749, 194399, 11311891, 56753854, 181573453, 419900760, 1861176493, 4142253746L, 14287937731L, 75581942401L});
  }
}
