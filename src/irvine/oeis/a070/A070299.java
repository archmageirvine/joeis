package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070299 Numbers n such that sigma(n+x) = sigma(n-x) for some 0 &lt; x &lt; n.
 * @author Sean A. Irvine
 */
public class A070299 extends Sequence1 {
  
  private long mN = 18;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long k = 1; k < mN; ++k) {
        if (Functions.SIGMA.l(mN + k) == Functions.SIGMA.l(mN - k)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
