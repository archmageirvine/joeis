package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068737 Number of solenoidal flows (flow in = flow out) in an n X n square array with integer velocities in -12 .. 12.
 * @author Sean A. Irvine
 */
public class A068737 extends A068723 {

  private int mN = 0;

  /** Construct the sequence. */
  public A068737() {
    super(1);
  }

  @Override
  public Z next() {
    return solenoidalFlows(++mN, 12);
  }
}
