package irvine.oeis.a091;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A091749 Generalized Bell numbers B_{7,2}.
 * @author Georg Fischer
 */
public class A091749 extends A091747 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(2, 2 * ++mN, k -> a(mN, k));
  }
}
