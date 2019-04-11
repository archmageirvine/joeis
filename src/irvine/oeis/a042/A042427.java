package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042427 Denominators of continued fraction convergents to <code>sqrt(741)</code>.
 * @author Sean A. Irvine
 */
public class A042427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042427() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14705390, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 4, 5, 9, 122, 2205, 28787, 30992, 59779, 270108, 14645611, 58852552, 73498163, 132350715, 1794057458, 32425384959L, 423324061925L, 455749446884L, 879073508809L, 3972043482120L});
  }
}
