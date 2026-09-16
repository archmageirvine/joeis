package irvine.oeis.a086;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A086572 Solution to A086571(a(n))=A086571(n) and a(n)&lt;&gt;n.
 * @author Sean A. Irvine
 */
public class A086572 extends A086571 {

  private final HashMap<Long, Long> mPos1 = new HashMap<>();
  private final HashMap<Long, Long> mPos2 = new HashMap<>();
  private final Sequence mS = new A086571();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    final long v = super.next().longValueExact();
    while (!mPos2.containsKey(v)) {
      ++mM;
      final long u = mS.next().longValueExact();
      if (mPos1.containsKey(u)) {
        mPos2.put(u, mM);
      } else {
        mPos1.put(u, mM);
      }
    }
    if (mPos1.get(v) == mN) {
      return Z.valueOf(mPos2.get(v));
    } else {
      // We've now reported both positions, so we can forget them both
      mPos2.remove(v);
      return Z.valueOf(mPos1.remove(v));
    }
  }
}
