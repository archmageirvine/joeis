package irvine.oeis.a091;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A091748 Generalized Bell numbers B_{6,2}.
 * @author Georg Fischer
 */
public class A091748 extends A091746 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(2, 2 * ++mN, k -> a(mN, k));
  }
}
