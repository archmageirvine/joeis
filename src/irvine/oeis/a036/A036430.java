package irvine.oeis.a036;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036430 Number of iterations needed to reach 1 under the map n -&gt; Omega(n).
 * @author Sean A. Irvine
 */
public class A036430 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long c = 0;
    while (m != 1) {
      m = Cheetah.factor(m).bigOmega();
      ++c;
    }
    return Z.valueOf(c);
  }
}
