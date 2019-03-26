package irvine.oeis.a019;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019548.
 * @author Sean A. Irvine
 */
public class A019548 implements Sequence {

  private final TreeSet<Long> mConcatOfCubes = new TreeSet<>();
  private long mN = -1;
  private long mM = 0;
  private long mS = 0;

  @Override
  public Z next() {
    while (true) {
      final long oldS = mS;
      if (++mN == mS) {
        mConcatOfCubes.add(mN);
        mS = ++mM * mM * mM;
      }
      final String v = String.valueOf(mN);
      for (int split = 1; split < v.length(); ++split) {
        if (mConcatOfCubes.contains(Long.valueOf(v.substring(0, split))) && mConcatOfCubes.contains(Long.valueOf(v.substring(split)))) {
          mConcatOfCubes.add(mN);
          if (mN == oldS) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
