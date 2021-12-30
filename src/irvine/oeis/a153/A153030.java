package irvine.oeis.a153;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A153030 Positions of even digits of Pi.
 * @author Georg Fischer
 */
public class A153030 extends A000796 {

  protected long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isEven()) {
        return Z.valueOf(mN);
      }
    }
  }
}
