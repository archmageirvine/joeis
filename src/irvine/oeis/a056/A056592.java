package irvine.oeis.a056;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A056592 Row sums of signed triangle A056588.
 * @author Sean A. Irvine
 */
public class A056592 extends A056588 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}

