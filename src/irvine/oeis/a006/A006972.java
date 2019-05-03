package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006972 Lucas-Carmichael numbers: squarefree composite numbers n such that p <code>| n =&gt; p+1 | n+1</code>.
 * @author Sean A. Irvine
 */
public class A006972 implements Sequence {

  private Z mN = Z.valueOf(397);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mN.isPrime()) {
        final Z m = mN.add(1);
        boolean ok = true;
        final FactorSequence fs = Cheetah.factor(mN);
        for (final Z p : fs.toZArray()) {
          if (fs.getExponent(p) > 1 || !Z.ZERO.equals(m.mod(p.add(1)))) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return mN;
        }
      }
    }
  }
}
