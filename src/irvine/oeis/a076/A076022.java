package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a073.A073662;
import irvine.util.array.LongDynamicLongArray;

/**
 * A076022 Position of 2n in A073662.
 * @author Sean A. Irvine
 */
public class A076022 extends Sequence1 {

  private final Sequence mA = new A073662();
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      ++mM;
      final Z t = mA.next();
      if (t.isEven()) {
        final long v = t.divide2().longValueExact();
        if (mFirsts.get(v) == 0) {
          mFirsts.set(v, mM);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
