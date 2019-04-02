package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042734 Numerators of continued fraction convergents to sqrt(897).
 * @author Sean A. Irvine
 */
public class A042734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042734() {
    super(new long[] {-1, 0, 0, 0, 1198, 0, 0, 0}, new long[] {29, 30, 569, 599, 35311, 35910, 681691, 717601});
  }
}
