package irvine.oeis.a383;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383750 allocated for Luke Bennet.
 * @author Sean A. Irvine
 */
public class A383750 extends Sequence1 {

  private static final ComputableComplexField FIELD = ComputableComplexField.SINGLETON;
  private static final Q ONE_EIGHTH = new Q(1, 8);
  private static final CR C = CR.THREE.sqrt().multiply(3).divide(8);
  private long mN = 0;

  // a(n) = number of iterations of z -> z^2 + c(n) with c(n) = -1/8+(1/n)^2 + (3*sqrt(3)/8)*i to reach |z| > 2, starting with z = 0.

  @Override
  public Z next() {
    ++mN;
    final CC c = new CC(CR.valueOf(new Q(1, mN).subtract(ONE_EIGHTH)), C.add(new Q(2, mN * mN)));
    long cnt = 0;
    CC z = FIELD.zero();
    while (FIELD.abs(z).compareTo(CR.TWO) <= 0) {
      z = FIELD.add(FIELD.multiply(z, z), c);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

