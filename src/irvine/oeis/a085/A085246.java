package irvine.oeis.a085;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085246 Satisfies a(1)=1, a(A026835(n+1)) = a(n)+1, with a(m)=0 for all m not found in A026835, where A026835(n+2)=A026835(n+1)+a(n)+1.
 * @author Sean A. Irvine
 */
public class A085246 extends Sequence1 {

  private final HashMap<Long, Long> mA = new HashMap<>();
  {
    mA.put(1L, 1L);
  }
  private long mN = 0;
  private long mR = 1;
  private long mM = 2;

  @Override
  public Z next() {
    if (++mN == mM) {
      final long step = mA.getOrDefault(mR++, 0L) + 1;
      mA.put(mM, step);
      mM += step;
    }
    return Z.valueOf(mA.getOrDefault(mN, 0L));
  }
}
