package irvine.oeis.a019;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019547.
 * @author Sean A. Irvine
 */
public class A019547 implements Sequence {

  private final TreeSet<Long> mConcatOfSquares = new TreeSet<>();
  private long mN = -1;
  private long mM = 0;
  private long mS = 0;

  @Override
  public Z next() {
    while (true) {
      final long oldS = mS;
      if (++mN == mS) {
        mConcatOfSquares.add(mN);
        mS = ++mM * mM;
      }
      final String v = String.valueOf(mN);
      for (int split = 1; split < v.length(); ++split) {
        if (mConcatOfSquares.contains(Long.parseLong(v.substring(0, split))) && mConcatOfSquares.contains(Long.parseLong(v.substring(split)))) {
          mConcatOfSquares.add(mN);
          if (mN == oldS) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
