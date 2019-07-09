package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024414 Positions of even numbers in <code>A024412</code>.
 * @author Sean A. Irvine
 */
public class A024414 extends A024412 {

  private long mN = -1;

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
