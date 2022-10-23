package irvine.oeis.a030;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030165 Numbers m such that uphi(sigma(m)) = 2m, where the unitary phi function (A047994) is defined by: if x = p1^r1*p2^r2*p3^r3*... then uphi(x) = (p1^r1 - 1)*(p2^r2 - 1)*(p3^r3 - 1)*...
 * @author Sean A. Irvine
 */
public class A030165 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(Jaguar.factor(mN).sigma()).unitaryPhi().equals(mN.multiply2())) {
        return mN;
      }
    }
  }
}
