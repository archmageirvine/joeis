package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068725 Number of solenoidal flows (flow in = flow out) in a 6x6 square array with integer velocities -n .. n.
 * @author Sean A. Irvine
 */
public class A068725 extends A068723 {

  private int mN = -1;

  @Override
  public Z next() {
    return solenoidalFlows(6, ++mN);
  }
}
