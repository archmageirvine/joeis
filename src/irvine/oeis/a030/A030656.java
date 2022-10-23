package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A030656 Pair up the numbers.
 * @author Sean A. Irvine
 */
public class A030656 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(String.valueOf(++mN) + ++mN);
  }
}

