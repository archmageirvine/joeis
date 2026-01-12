package irvine.oeis.a083;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083121 Bases of the squares arising in A083119.
 * @author Sean A. Irvine
 */
public class A083121 extends Sequence1 {

  private final A083119 mS = new A083119();
  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(++mN, 2 * mN - 1, mS::a).sqrt();
  }
}

