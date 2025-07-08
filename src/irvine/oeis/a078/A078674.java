package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078674 Number of ways to lace a shoe that has n pairs of eyelets, assuming the lacing satisfies certain conditions.
 * @author Sean A. Irvine
 */
public class A078674 extends A078629 {

  @Override
  public Z next() {
    return super.next().divide2().max(Z.ONE);
  }
}

