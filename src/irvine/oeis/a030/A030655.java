package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030655 Pair up the numbers.
 * @author Sean A. Irvine
 */
public class A030655 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(String.valueOf(++mN) + ++mN);
  }
}

