package irvine.oeis.a030;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030165 Numbers n such that <code>uphi(sigma(n)) = 2n</code>, where the unitary phi function <code>(A047994)</code> is defined by: if <code>x=p1^r1*p2^r2*p3^r3*..</code>. then <code>uphi(x)=(p1^r1-1)(p2^r2-1)(p3^r3-1)..</code>.
 * @author Sean A. Irvine
 */
public class A030165 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(Cheetah.factor(mN).sigma()).unitaryPhi().equals(mN.multiply2())) {
        return mN;
      }
    }
  }
}
