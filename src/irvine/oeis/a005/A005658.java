package irvine.oeis.a005;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005658 If n appears so do 2n, 3n+2, 6n+3.
 * @author Sean A. Irvine
 */
public class A005658 extends Sequence1 {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z res = mPriority.pollFirst();
    mPriority.add(res.multiply2());
    mPriority.add(res.multiply(3).add(2));
    mPriority.add(res.multiply(6).add(3));
    return res;
  }
}

