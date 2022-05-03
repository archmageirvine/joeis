package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056697 a(n) is least N &gt; 1 congruent to -1,0, or 1 mod i for all i=1,...,n.
 * @author Sean A. Irvine
 */
public class A056697 implements Sequence {

  private long mN = 0;
  private long mM = 2;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      boolean ok = true;
      for (long t = mN; t > 1; --t) {
        final long r = mM % t;
        if (r != 0 && r != 1 && r != t - 1) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return Z.valueOf(mM);
      }
      ++mM;
    }
  }
}
