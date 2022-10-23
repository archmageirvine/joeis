package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A034079 Decimal part of n-th root of a(n) starts with digit 2.
 * @author Sean A. Irvine
 */
public class A034079 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final CR p = CR.valueOf(new Q(1, ++mN));
    Z m = Z.ONE;
    while (true) {
      m = m.add(1);
      if (ComputableReals.SINGLETON.pow(CR.valueOf(m), p).frac().multiply(10).floor().longValue() == 2) {
        return m;
      }
    }
  }
}

