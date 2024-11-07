package irvine.oeis.a072;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072927 a(n) = minimum value of abs(n-phi(x)), x&gt;0.
 * @author Sean A. Irvine
 */
public class A072927 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = -1;
    while (true) {
      ++k;
      if (!InverseEuler.inversePhi(Z.valueOf(mN + k)).isEmpty()) {
        return Z.valueOf(k);
      }
      if (k > 0 && k < mN && !InverseEuler.inversePhi(Z.valueOf(mN - k)).isEmpty()) {
        return Z.valueOf(k);
      }
    }
  }
}

