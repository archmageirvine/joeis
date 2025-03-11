package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075842 n 1's followed by n.
 * @author Sean A. Irvine
 */
public class A075842 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return new Z("1".repeat(++mN) + mN);
  }
}
