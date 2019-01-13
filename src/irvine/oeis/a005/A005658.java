package irvine.oeis.a005;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005658.
 * @author Sean A. Irvine
 */
public class A005658 implements Sequence {

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

