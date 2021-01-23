package irvine.oeis.a005;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005660 If n appears so do 2n+2 and 3n+3.
 * @author Sean A. Irvine
 */
public class A005660 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.THREE);
  }

  @Override
  public Z next() {
    final Z res = mPriority.pollFirst();
    mPriority.add(res.multiply2().add(2));
    mPriority.add(res.multiply(3).add(3));
    return res;
  }
}

