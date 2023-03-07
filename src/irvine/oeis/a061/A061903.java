package irvine.oeis.a061;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A061715.
 * @author Sean A. Irvine
 */
public class A061903 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long t = ++mN;
    final HashSet<Long> seen = new HashSet<>();
    while (true) {
      t = ZUtils.digitSum(t * t);
      if (!seen.add(t)) {
        return Z.valueOf(seen.size());
      }
    }
  }
}

