package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002034;
import irvine.util.array.LongDynamicLongArray;

/**
 * A018194 Number of steps for S(S(..S(n)..)) to converge, where S is the Kempner function A002034.
 * @author Sean A. Irvine
 */
public class A018194 implements Sequence {

  private final Sequence mA2034 = new A002034();
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  {
    mA.set(0, 0L);
  }
  private long mN = 0;

  private long a2034(final long n) {
    while (n >= mA.length()) {
      mA.set(mA.length(), mA2034.next().longValueExact());
    }
    return mA.get(n);
  }

  @Override
  public Z next() {
    long m = ++mN;
    long c = 1;
    while (m != 0) {
      final long t = a2034(m);
      if (t == m) {
        break;
      }
      m = t;
      ++c;
    }
    return Z.valueOf(c);
  }
}

