package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030655 Pair up the numbers.
 * @author Sean A. Irvine
 */
public class A030655 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(String.valueOf(++mN) + ++mN);
  }
}

