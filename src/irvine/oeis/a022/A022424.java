package irvine.oeis.a022;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022424 Solution a( ) of the complementary equation a(n) = b(n-1) + b(n-2), where a(0) = 1, a(1) = 2; see Comments.
 * @author Sean A. Irvine
 */
public class A022424 extends Sequence0 {

  private final TreeSet<Long> mS = new TreeSet<>();
  private final long mA0;
  private final long mA1;
  private long mB = 0;

  /**
   * Construct a sequence.
   * @param a0 first term
   * @param a1 second term
   */
  public A022424(final long a0, final long a1) {
    mA0 = a0;
    mA1 = a1;
  }

  /** Construct the sequence. */
  public A022424() {
    this(1, 2);
  }

  @Override
  public Z next() {
    if (mS.size() < 3) {
      if (mS.isEmpty()) {
        mS.add(0L); // keep mex happy
        mS.add(mA0);
        return Z.valueOf(mA0);
      } else {
        mS.add(mA1);
        mB = LongUtils.mex(mS);
        mS.add(mB);
        return Z.valueOf(mA1);
      }
    }
    final long t = mB;
    mB = LongUtils.mex(mS);
    mS.add(mB);
    final long a = t + mB;
    mS.add(a);
    return Z.valueOf(a);
  }
}
