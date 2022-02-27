package irvine.oeis.a054;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054901 Numbers of the form 2^i*5^j where i+j is even.
 * @author Sean A. Irvine
 */
public class A054901 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply(4));
    mPriority.add(r.multiply(10));
    mPriority.add(r.multiply(25));
    return r;
  }
}
