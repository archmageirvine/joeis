package irvine.oeis.a153;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A153032 Positions of digits of Pi that are divisible by 3.
 * @author Georg Fischer
 */
public class A153032 extends A000796 {

  protected long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final int dig = super.next().intValue();
      if (dig == 0 || dig == 3 || dig == 6 || dig == 9) {
        return Z.valueOf(mN);
      }
    }
  }
}
