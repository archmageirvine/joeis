package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a001.A001691;

/**
 * A071605 Number of ordered pairs (a,b) of elements of the symmetric group S_n such that the pair a,b generates S_n.
 * @author Sean A. Irvine
 */
public class A071605 extends A001691 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z t = super.next();
    return ++mN <= 2 ? t.add(mN) : t.multiply2();
  }
}
