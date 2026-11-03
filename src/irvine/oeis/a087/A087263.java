package irvine.oeis.a087;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.a025.A025586;

/**
 * A087263 a(n) is the least initial value of a 3x+1 trajectory in which n is the largest (peak) term or a(n) = 0 if n cannot be a peak value (i.e., when n = 2k+1, n = 4k+2, n = 16k+12, etc.).
 * @author Sean A. Irvine
 */
public class A087263 extends A025586 {

  private final HashMap<Z, Z> mSeen = new HashMap<>();

  @Override
  public Z next() {
    mSeen.putIfAbsent(super.next(), mN);
    final Z res = mSeen.remove(mN);
    return res == null ? Z.ZERO : res;
  }
}

