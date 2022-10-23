package irvine.oeis.a054;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054774 Numbers of the form 2^i*5^j where i+j is odd.
 * @author Sean A. Irvine
 */
public class A054774 extends Sequence1 {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.TWO);
    mPriority.add(Z.FIVE);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply(4));
    mPriority.add(r.multiply(25));
    return r;
  }
}
