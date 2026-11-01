package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A087159 Satisfies a(1)=1, a(A087160(n+1)) = a(n)+1, with a(m)=2 for all m not found in A087160, where A087160(n+2)=A087160(n+1)+a(n)+1.
 * @author Sean A. Irvine
 */
public class A087159 extends Sequence1 {

  private final LongDynamicIntArray mA = new LongDynamicIntArray();
  private long mN = 0;
  private long mR = 1;
  private long mM = 2;
  {
    mA.set(1, 1);
  }

  private int get(final long n) {
    final int v = mA.get(n);
    return v == 0 ? 2 : v;
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
