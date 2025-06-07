package irvine.oeis.a384;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384513 a(n) = number of iterations of z -&gt; z^2 + c(n) with c(n) = 16/(n^2) + (1/n)*i + 3/8 + (sqrt(3)/8)*i to reach |z| &gt; 2, starting with z = 0.
 * @author Sean A. Irvine
 */
public class A384513 extends Sequence1 {

  private static final ComputableComplexField FIELD = ComputableComplexField.SINGLETON;
  private static final Q THREE_EIGHTH = new Q(3, 8);
  private static final CR C = CR.THREE.sqrt().divide(8);
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final CC c = new CC(CR.valueOf(new Q(16, mN * mN).add(THREE_EIGHTH)), C.add(new Q(1, mN)));
    long cnt = 0;
    CC z = FIELD.zero();
    while (FIELD.abs(z).compareTo(CR.TWO) <= 0) {
      z = FIELD.add(FIELD.multiply(z, z), c);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

