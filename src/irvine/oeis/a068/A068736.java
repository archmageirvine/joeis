package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068736 Number of solenoidal flows (flow in = flow out) in an n X n square array with integer velocities in -11 .. 11.
 * @author Sean A. Irvine
 */
public class A068736 extends A068723 {

  private int mN = 0;

  /** Construct the sequence. */
  public A068736() {
    super(1);
  }

  @Override
  public Z next() {
    return solenoidalFlows(++mN, 11);
  }
}
