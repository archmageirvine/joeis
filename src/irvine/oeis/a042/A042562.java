package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042562 Numerators of continued fraction convergents to sqrt(810).
 * @author Sean A. Irvine
 */
public class A042562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042562() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 54758, 0, 0, 0, 0, 0, 0, 0}, new long[] {28, 57, 313, 370, 1793, 2163, 12608, 27379, 1545832, 3119043, 17141047, 20260090, 98181407, 118441497, 690388892, 1499219281});
  }
}
