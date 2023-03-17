package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a004.A004760;

/**
 * A080565 Binary expansion of n has form 11**...*1.
 * <code>a(n) = 2 * A004760(n) + 1</code>
 * @author Georg Fischer
 */
public class A080565 extends A004760 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply2().add(1);
  }
}
