package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042615 Denominators of continued fraction convergents to sqrt(836).
 * @author Sean A. Irvine
 */
public class A042615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042615() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 93102, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 11, 12, 23, 58, 81, 139, 1471, 1610, 91631, 93241, 1024041, 1117282, 2141323, 5399928, 7541251, 12941179, 136953041, 149894220});
  }
}
