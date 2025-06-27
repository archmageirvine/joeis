package irvine.oeis.a078;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a006.A006530;

/**
 * A078328 Least m such that A078142(m) = A006530(m) = n-th prime.
 * @author Sean A. Irvine
 */
public class A078328 extends A000040 {

  private final HashMap<Z, Long> mMap = new HashMap<>();
  private final Sequence mA = new A078142();
  private final Sequence mB = new A006530();
  private long mM = 0;

  @Override
  public Z next() {
    final Z p = super.next();
    while (!mMap.containsKey(p)) {
      ++mM;
      final Z a = mA.next();
      final Z b = mB.next();
      if (a.equals(b) && a.isProbablePrime()) {
        mMap.putIfAbsent(a, mM);
      }
    }
    return Z.valueOf(mMap.get(p));
  }
}

