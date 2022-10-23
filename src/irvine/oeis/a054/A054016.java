package irvine.oeis.a054;

import java.util.HashSet;
import java.util.Set;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054016 a(n) = smallest nonnegative integer not the Nim sum of at most 4 earlier terms.
 * @author Sean A. Irvine
 */
public class A054016 extends Sequence1 {

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
        }
      }
    }
    return Z.valueOf(mex);
  }
}
