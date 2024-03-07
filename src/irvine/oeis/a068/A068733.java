package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068733 Number of solenoidal flows (flow in = flow out) in an n X n square array with integer velocities in -8 .. 8.
 * @author Sean A. Irvine
 */
public class A068733 extends A068723 {

  private int mN = 0;

  /** Construct the sequence. */
  public A068733() {
    super(1);
  }

  @Override
  public Z next() {
    return solenoidalFlows(++mN, 8);
  }
}
