package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041512 Numerators of continued fraction convergents to sqrt(273).
 * @author Sean A. Irvine
 */
public class A041512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041512() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1454, 0, 0, 0, 0, 0}, new long[] {16, 17, 33, 347, 380, 727, 23644, 24371, 48015, 504521, 552536, 1057057});
  }
}
