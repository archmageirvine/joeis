package irvine.oeis.a022;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022427 a(n) = c(n-1) + c(n-3) where c is the sequence of numbers not in a.
 * @author Sean A. Irvine
 */
public class A022427 implements Sequence {

  private final TreeSet<Long> mS = new TreeSet<>();
  private final long mA0;
  private final long mA1;
  private final long mA2;
  private long mB0 = 0;
  private long mB1 = 0;

  /**
   * Construct a sequence.
   * @param a0 first term
   * @param a1 second term
   * @param a2 third term
   */
  public A022427(final long a0, final long a1, final long a2) {
    mA0 = a0;
    mA1 = a1;
    mA2 = a2;
  }

  /** Construct the sequence. */
  public A022427() {
    this(1, 2, 3);
  }

  @Override
  public Z next() {
    if (mS.size() < 5) {
      if (mS.isEmpty()) {
        mS.add(0L); // keep mex happy
        mS.add(mA0);
        return Z.valueOf(mA0);
      } else if (mS.size() == 2) {
        mS.add(mA1);
        return Z.valueOf(mA1);
      } else {
        mS.add(mA2);
        mB0 = LongUtils.mex(mS);
        mS.add(mB0);
        mB1 = LongUtils.mex(mS);
        mS.add(mB1);
        return Z.valueOf(mA2);
      }
    }
    final long t = mB0;
    mB0 = mB1;
    mB1 = LongUtils.mex(mS);
    mS.add(mB1);
    final long a = t + mB1;
    mS.add(a);
    return Z.valueOf(a);
  }
}
