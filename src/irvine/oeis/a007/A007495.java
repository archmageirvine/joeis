package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a032.A032434;

/**
 * A007495 Josephus problem: survivors.
 * @author Sean A. Irvine
 */
public class A007495 extends A032434 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(get(++mN, mN));
  }
}

