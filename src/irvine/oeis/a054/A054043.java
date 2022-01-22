package irvine.oeis.a054;

import java.util.HashSet;
import java.util.Set;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054043 Grundy function for turn-at-most-6-coins game.
 * @author Sean A. Irvine
 */
public class A054043 implements Sequence {

  private final Set<Long> mA = new HashSet<>();
  private final Set<Long> mRejects = new HashSet<>();
  {
    mRejects.add(0L);
  }

  @Override
  public Z next() {
    final long mex = LongUtils.mex(mRejects);
    mA.add(mex);
    mRejects.add(mex);
    for (final long i : mA) {
      mRejects.add(i ^ mex);
      for (final long j : mA) {
        if (i == j) {
          break;
        }
        mRejects.add(i ^ j ^ mex);
        for (final long k : mA) {
          if (k == j) {
            break;
          }
          mRejects.add(i ^ j ^ k ^ mex);
          for (final long l : mA) {
            if (l == k) {
              break;
            }
            mRejects.add(i ^ j ^ k ^ l ^ mex);
          }
        }
      }
    }
    return Z.valueOf(mex);
  }
}
