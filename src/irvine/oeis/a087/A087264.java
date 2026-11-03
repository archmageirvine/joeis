package irvine.oeis.a087;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.a025.A025586;

/**
 * A087264 a(n) is the least initial value of a 3x+1 trajectory in which 4n is the largest(peak) term or a(n)=0 if 4n cannot be a peak.
 * @author Sean A. Irvine
 */
public class A087264 extends A025586 {

  private final HashMap<Z, Z> mSeen = new HashMap<>();

  @Override
  public Z next() {
    while (true) {
      final Z m = super.next();
      if (m.mod(4) == 0) {
        mSeen.putIfAbsent(m, mN);
      }
      if (mN.mod(4) == 0) {
        final Z res = mSeen.remove(mN);
        return res == null ? Z.ZERO : res;
      }
    }
  }
}

