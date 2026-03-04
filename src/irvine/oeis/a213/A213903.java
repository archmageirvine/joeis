package irvine.oeis.a213;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000040;
import irvine.util.array.DynamicLongArray;

/**
 * A213903 Least number x such that there are n numbers of the form 6k-1 or 6k+1 between prime(x) and prime(x+1).
 * @author Sean A. Irvine
 */
public class A213903 extends AbstractSequence {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mM = -1;
  private Z mP = Z.TWO;

  private final A000040 mSeq = new A000040();

  /** Construct the sequence. */
  public A213903() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      ++mM;
      final Z q = mP;
      mP = mSeq.next();
      final int d = mP.divide(3).subtract(q.divide(3)).intValueExact();
      if (mFirsts.get(d) == 0) {
        mFirsts.set(d, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
