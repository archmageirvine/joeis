package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068735 Number of solenoidal flows (flow in = flow out) in an n X n square array with integer velocities in -10 .. 10.
 * @author Sean A. Irvine
 */
public class A068735 extends A068723 {

  private int mN = 0;

  /** Construct the sequence. */
  public A068735() {
    super(1);
  }

  @Override
  public Z next() {
    return solenoidalFlows(++mN, 10);
  }
}
