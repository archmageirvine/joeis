package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a066.A066066;
import irvine.util.array.LongDynamicLongArray;

/**
 * A070773 Number of solutions to p(2m)-2p(m)=2n-1, where p(m) = m-th prime.
 * @author Sean A. Irvine
 */
public class A070773 extends Sequence1 implements Conjectural {

  private final Sequence mA = new A066066().skip();
  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    mN += 2;
    while (mM < 1000 + 10 * mN) { // Dubious
      final long v = mA.next().longValueExact();
      mCounts.increment(v);
      ++mM;
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
