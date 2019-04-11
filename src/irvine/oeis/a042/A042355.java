package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042355 Denominators of continued fraction convergents to <code>sqrt(704)</code>.
 * @author Sean A. Irvine
 */
public class A042355 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042355() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 158402, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 15, 197, 1394, 1591, 2985, 156811, 159796, 316607, 2376045, 31205192, 220812389, 252017581, 472829970});
  }
}
