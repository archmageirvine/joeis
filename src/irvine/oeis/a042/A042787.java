package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042787 Denominators of continued fraction convergents to <code>sqrt(924)</code>.
 * @author Sean A. Irvine
 */
public class A042787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042787() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 23102, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 5, 73, 78, 151, 380, 22951, 46282, 69233, 115515, 1686443, 1801958, 3488401, 8778760});
  }
}
