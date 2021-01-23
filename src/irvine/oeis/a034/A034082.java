package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034082 Least integer m such that the decimal part of the n-th root of m starts with digit 5.
 * @author Sean A. Irvine
 */
public class A034082 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    final CR p = CR.valueOf(new Q(1, ++mN));
    Z m = Z.ONE;
    while (true) {
      m = m.add(1);
      if (ComputableReals.SINGLETON.pow(CR.valueOf(m), p).frac().multiply(10).floor().longValue() == 5) {
        return m;
      }
    }
  }
}

