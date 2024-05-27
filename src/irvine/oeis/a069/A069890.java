package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a066.A066066;
import irvine.util.array.LongDynamicLongArray;

/**
 * A069890 Smallest odd number k such that p(2m)-2p(m)=k has exactly n solutions (where p(m) = m-th prime).
 * @author Sean A. Irvine
 */
public class A069890 extends Sequence0 implements Conjectural {

  private final Sequence mA = new A066066().skip();
  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mM < 1000 + 100 * mN * mN * mN) { // Dubious
      final long v = mA.next().longValueExact();
      mCounts.increment(v);
      ++mM;
    }
    long k = -1;
    while (k < mCounts.length()) {
      k += 2;
      if (mCounts.get(k) == mN) {
        return Z.valueOf(k);
      }
    }
    throw new UnsupportedOperationException();
  }
}
