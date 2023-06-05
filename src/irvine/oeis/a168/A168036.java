package irvine.oeis.a168;

import irvine.math.z.Z;
import irvine.oeis.a003.A003415;

/**
 * A168036 Difference between n&apos; and n, where n&apos; is the arithmetic derivative of n (A003415).
 * @author Georg Fischer
 */
public class A168036 extends A003415 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.next().subtract(mN);
  }
}
