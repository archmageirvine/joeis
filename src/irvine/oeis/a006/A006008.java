package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006008 Number of inequivalent ways to color vertices of a regular tetrahedron using &lt;= n colors.
 * @author Sean A. Irvine
 */
public class A006008 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z ns = mN.square();
    return ns.add(11).multiply(ns).divide(12);
  }
}

