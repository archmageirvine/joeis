package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A086960 a(A086957(n))=A086958(n), a(A086958(n))=A086959(n), a(A086959(n))=A086957(n), see A086956.
 * @author Sean A. Irvine
 */
public class A086960 extends Sequence1 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private final Sequence mS0 = new A086957();
  private final Sequence mS1 = new A086958();
  private final Sequence mS2 = new A086959();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0) {
      final long s0 = mS0.next().longValueExact();
      final long s1 = mS1.next().longValueExact();
      final long s2 = mS2.next().longValueExact();
      mA.set(s0, s1);
      mA.set(s1, s2);
      mA.set(s2, s0);
    }
    return Z.valueOf(mA.get(mN));
  }
}


