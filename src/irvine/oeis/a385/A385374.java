package irvine.oeis.a385;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a060.A060016;

/**
 * A385374 a(n) is the number of partitions of n into tau(n) distinct parts.
 * @author Sean A. Irvine
 */
public class A385374 extends A060016 {

  private int mN = 0;

  @Override
  public Z next() {
    return get(++mN, Functions.SIGMA0.i(mN));
  }
}

