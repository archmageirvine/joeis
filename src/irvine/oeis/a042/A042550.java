package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042550 Numerators of continued fraction convergents to sqrt(804).
 * @author Sean A. Irvine
 */
public class A042550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042550() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1030190, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {28, 57, 85, 397, 879, 16219, 33317, 149487, 182804, 515095, 29028124, 58571343, 87599467, 408969211, 905537889, 16708651213L, 34322840315L, 154000012473L, 188322852788L, 530645718049L});
  }
}
