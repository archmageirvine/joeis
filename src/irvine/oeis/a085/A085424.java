package irvine.oeis.a085;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085424 Number of ones in the symmetric signed digit expansion of n with q=2 (i.e., the representation of n in the (-1,0,1)_2 number system).
 * @author Sean A. Irvine
 */
public class A085424 extends Sequence1 {

  private static final Q C5 = new Q(5, 6);
  private static final Q C4 = new Q(4, 6);
  private static final Q C2 = new Q(2, 6);
  private static final Q C1 = new Q(1, 6);
  private long mN = 0;

  static long ep(final long r, final long n) {
    final Q t = new Q(n, 1L << (r + 2));
    return t.add(C5).floor().longValueExact() - t.add(C4).floor().longValueExact() - t.add(C2).floor().longValueExact() + t.add(C1).floor().longValueExact();
  }

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long r = 0; 1L << r < 3 * mN; ++r) {
      if (ep(r, mN) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

