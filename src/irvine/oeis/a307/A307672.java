package irvine.oeis.a307;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicByteArray;

/**
 * A307672 The right half of a bi-infinite word invariant under the balanced morphism, {0-&gt;501, 1-&gt;210, 2-&gt;123, 3-&gt;432, 4-&gt;345, 5-&gt;054}, starting from axiom a(0)=0.
 * @author Sean A. Irvine
 */
public class A307672 extends Sequence0 {

  private static final byte[][] EXPAND = {{5, 0, 1}, {2, 1, 0}, {1, 2, 3}, {4, 3, 2}, {3, 4, 5}, {0, 5, 4}};
  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  {
    mA.set(0L, (byte) 0);
    mA.set(1L, (byte) 1);
  }
  private long mPos = -1;
  private long mExpand = 0;

  @Override
  public Z next() {
    if (++mPos >= mA.length()) {
      for (final byte v : EXPAND[mA.get(++mExpand)]) {
        mA.set(mA.length(), v);
      }
    }
    return Z.valueOf(mA.get(mPos));
  }
}
