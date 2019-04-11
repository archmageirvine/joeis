package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042173 Denominators of continued fraction convergents to <code>sqrt(611)</code>.
 * @author Sean A. Irvine
 */
public class A042173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042173() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 473852, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 4, 7, 32, 71, 103, 277, 1211, 1488, 2699, 6886, 9585, 466966, 476551, 1420068, 1896619, 3316687, 15163367, 33643421, 48806788, 131256997, 573834776, 705091773, 1278926549, 3262944871L, 4541871420L});
  }
}
