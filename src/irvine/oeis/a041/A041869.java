package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041869 Denominators of continued fraction convergents to sqrt(456).
 * @author Sean A. Irvine
 */
public class A041869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041869() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2050, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 14, 17, 48, 2033, 4114, 6147, 28702, 34849, 98400});
  }
}
