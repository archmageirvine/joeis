package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006008 Number of inequivalent ways to color vertices of a regular tetrahedron using <code>&lt;= n</code> colors.
 * @author Sean A. Irvine
 */
public class A006008 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z ns = mN.square();
    return ns.add(11).multiply(ns).divide(12);
  }
}

