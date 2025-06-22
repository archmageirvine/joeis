package irvine.oeis.a091;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a092.A092077;

/**
 * A091757 Generalized Bell numbers B_{8,2}.
 * @author Georg Fischer
 */
public class A091757 extends A092077 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(2, 2 * ++mN, k -> a(mN, k));
  }
}
