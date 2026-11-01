package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A087157 Satisfies a(1)=1, a(A087158(n+1)) = a(n)+1, with a(m)=1 for all m not found in A087158, where A087158(n+2)=A087158(n+1)+a(n)+1.
 * @author Sean A. Irvine
 */
public class A087157 extends Sequence1 {

  private final LongDynamicIntArray mA = new LongDynamicIntArray();
  private long mN = 0;
  private long mR = 1;
  private long mM = 2;

  private int get(final long n) {
    return Math.max(1, mA.get(n));
  }

  @Override
  public Z next() {
    if (++mN == mM) {
      final int v = get(mR++) + 1;
      mA.set(mM, v);
      mM += v;
    }
    return Z.valueOf(get(mN));
  }
}
