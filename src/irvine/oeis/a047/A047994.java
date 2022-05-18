package irvine.oeis.a047;

import irvine.factor.factor.Jaguar;
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
    return Jaguar.factor(++mN).unitaryPhi();
  }
}
