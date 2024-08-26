package irvine.oeis.a072;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a091.A091534;

/**
 * A072019 Generalized Bell numbers B_{5,2}.
 * @author Sean A. Irvine
 */
public class A072019 extends A091534 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(2, 2 * ++mN, k -> mB.get(mN, k));
  }
}
