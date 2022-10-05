package irvine.oeis.a059;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A059731 Row sums in A059922.
 * @author Sean A. Irvine
 */
public class A059731 extends A059922 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> get(k, mN));
  }
}

