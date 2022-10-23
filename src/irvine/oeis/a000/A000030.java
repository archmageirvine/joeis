package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000030 Initial digit of n.
 * @author Sean A. Irvine
 */
public class A000030 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(String.valueOf(++mN).charAt(0) - '0');
  }
}

