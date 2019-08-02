package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024977 Positions of even numbers in <code>A024975</code>.
 * @author Sean A. Irvine
 */
public class A024977 extends A024975 {

  private long mN = 0;

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
