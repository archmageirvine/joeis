package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068734 Number of solenoidal flows (flow in = flow out) in an n X n square array with integer velocities in -9 .. 9.
 * @author Sean A. Irvine
 */
public class A068734 extends A068723 {

  private int mN = 0;

  /** Construct the sequence. */
  public A068734() {
    super(1);
  }

  @Override
  public Z next() {
    return solenoidalFlows(++mN, 9);
  }
}
