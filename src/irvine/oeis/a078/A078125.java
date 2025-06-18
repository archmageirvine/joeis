package irvine.oeis.a078;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A078125 Number of partitions of 3^n into powers of 3.
 * @author Sean A. Irvine
 */
public class A078125 extends A078122 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> mB.get(mN, k));
  }
}

