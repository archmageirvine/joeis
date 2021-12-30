package irvine.oeis.a153;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A153031 Positions of prime digits of Pi.
 * @author Georg Fischer
 */
public class A153031 extends A000796 {

  protected long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final int dig = super.next().intValue();
      if (dig == 2 || dig == 3 || dig == 5 || dig == 7) {
        return Z.valueOf(mN);
      }
    }
  }
}
