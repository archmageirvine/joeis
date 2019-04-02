package irvine.oeis.a005;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005661 n in S implies 2n-2, 3n-3 in S.
 * @author Sean A. Irvine
 */
public class A005661 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.FIVE);
  }

  @Override
  public Z next() {
    final Z res = mPriority.pollFirst();
    mPriority.add(res.multiply2().subtract(2));
    mPriority.add(res.multiply(3).subtract(3));
    return res;
  }
}

