package irvine.oeis.a030;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030165 Numbers n such that uphi(sigma(n)) = 2n, where the unitary phi function (A047994) is defined by: if x=p1^r1*p2^r2*p3^r3*... then uphi(x)=(p1^r1-1)(p2^r2-1)(p3^r3-1)...
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
