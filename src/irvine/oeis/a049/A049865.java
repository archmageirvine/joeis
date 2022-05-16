package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049865 Number of iterations of unitary totient function (A047994) required to reach 1 from n.
 * @author Sean A. Irvine
 */
public class A049865 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    long m = ++mN;
    while (m != 1) {
      m = Jaguar.factor(m).unitaryPhi().longValueExact();
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
