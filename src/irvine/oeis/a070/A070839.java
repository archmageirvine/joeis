package irvine.oeis.a070;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070837.
 * @author Sean A. Irvine
 */
public class A070839 extends Sequence1 {

  private final HashSet<Long> mSeen = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long s = ++mN + Functions.REVERSE.l(mN);
      if (s % 11 == 0 && mSeen.add(s)) {
        return Z.valueOf(mN);
      }
    }
  }
}

