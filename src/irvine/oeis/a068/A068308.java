package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a024.A024936;
import irvine.util.array.DynamicLongArray;

/**
 * A068308 a(n) = largest number m such that A024936(m) is n.
 * @author Sean A. Irvine
 */
public class A068308 extends AbstractSequence {

  private final DynamicLongArray mLast = new DynamicLongArray();
  private final Sequence mA = new A024936();
  private long mM = -1;
  private int mN = -1;

  /** Construct the sequence. */
  public A068308() {
    super(-1);
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final int t = mA.next().intValue() + 1; // offset by 1 to handle -1's in A024936
      mLast.set(t, ++mM);
      if (t - 3 > mN) {
        return Z.valueOf(mLast.get(mN));
      }
    }
  }
}
