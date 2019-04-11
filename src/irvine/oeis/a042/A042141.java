package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042141 Denominators of continued fraction convergents to <code>sqrt(595)</code>.
 * @author Sean A. Irvine
 */
public class A042141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042141() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 37028, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 5, 23, 28, 135, 163, 298, 759, 36730, 74219, 110949, 185168, 851621, 1036789, 4998777, 6035566, 11034343, 28104252});
  }
}
