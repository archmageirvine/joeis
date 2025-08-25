package irvine.oeis.a079;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079618.
 * @author Sean A. Irvine
 */
public class A079706 extends Sequence1 {

  private final HashSet<Long> mNoSolution = new HashSet<>();
  {
    mNoSolution.add(4L);
    mNoSolution.add(16L);
    mNoSolution.add(32L);
    mNoSolution.add(64L);
  }
  private long mN = 0;

  @Override
  public Z next() {
    if (mNoSolution.contains(++mN)) {
      return Z.NEG_ONE;
    }
    final Z m = Z.valueOf(2 * mN);
    Z r = m;
    long k = 1;
    while (!r.add(1).isProbablePrime()) {
      ++k;
      r = r.multiply(m);
    }
    return Z.valueOf(k);
  }
}

