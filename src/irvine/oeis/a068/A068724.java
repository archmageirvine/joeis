package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068724 Number of solenoidal flows (flow in = flow out) in a 5 X 5 square array with integer velocities -n .. n.
 * @author Sean A. Irvine
 */
public class A068724 extends A068723 {

  private int mN = -1;

  @Override
  public Z next() {
    return solenoidalFlows(5, ++mN);
  }
}
