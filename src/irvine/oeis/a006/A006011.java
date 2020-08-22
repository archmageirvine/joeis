package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006011 a(n) = n^2*(n^2 - 1)/4.
 * @author Sean A. Irvine
 */
public class A006011 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z ns = mN.square();
    return ns.subtract(1).multiply(ns).divide(4);
  }
}

