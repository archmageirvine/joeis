package irvine.oeis.a047;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047994 Unitary totient (or unitary phi) function uphi(n).
 * @author Sean A. Irvine
 */
public class A047994 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).unitaryPhi();
  }
}
