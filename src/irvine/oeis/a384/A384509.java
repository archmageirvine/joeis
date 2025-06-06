package irvine.oeis.a384;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384509 allocated for Luke Bennet.
 * @author Sean A. Irvine
 */
public class A384509 extends Sequence1 {

  private static final ComputableComplexField FIELD = ComputableComplexField.SINGLETON;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final CR r = CR.SQRT2.multiply(mN);
    final CC c = new CC(CR.valueOf(new Q(mN + 5, mN)).divide(r).add(Q.ONE_QUARTER), CR.valueOf(new Q(5 - mN, mN)).divide(r).add(Q.HALF));
    long cnt = 0;
    CC z = FIELD.zero();
    while (FIELD.abs(z).compareTo(CR.TWO) <= 0) {
      z = FIELD.add(FIELD.multiply(z, z), c);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

