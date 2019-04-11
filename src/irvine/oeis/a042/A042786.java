package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042786 Numerators of continued fraction convergents to <code>sqrt(924)</code>.
 * @author Sean A. Irvine
 */
public class A042786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042786() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 23102, 0, 0, 0, 0, 0, 0, 0}, new long[] {30, 61, 91, 152, 2219, 2371, 4590, 11551, 697650, 1406851, 2104501, 3511352, 51263429, 54774781, 106038210, 266851201});
  }
}
