package irvine.oeis.a056;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A056593 Row sums of unsigned triangle A056588.
 * @author Sean A. Irvine
 */
public class A056593 extends A056588 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next().abs());
  }
}

