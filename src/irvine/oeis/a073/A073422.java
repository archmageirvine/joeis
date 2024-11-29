package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073422 e = 1/a(0)+1/a(1)+1/a(2)+1/a(3)+... with each term a(n) being a positive or negative integer chosen so as to minimize the absolute difference between e and the partial sum.
 * @author Sean A. Irvine
 */
public class A073422 extends Sequence0 {

  private Q mSum = null;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Q.ONE;
      return Z.ONE;
    }
    final CR delta = CR.E.subtract(CR.valueOf(mSum)).inverse();
    final Z floor = delta.floor();
    final Z ceil = delta.ceil();
    final Q c = mSum.add(new Q(1, ceil));
    if (floor.isZero()) {
      mSum = c;
      return ceil;
    }
    final Q f = mSum.add(new Q(1, floor));
    if (CR.E.subtract(CR.valueOf(f)).abs().compareTo(CR.E.subtract(CR.valueOf(c)).abs()) < 0) {
      mSum = f;
      return floor;
    } else {
      mSum = c;
      return ceil;
    }
  }
}

