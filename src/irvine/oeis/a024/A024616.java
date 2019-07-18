package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024616 Positions of odd numbers in <code>A024614</code>.
 * @author Sean A. Irvine
 */
public class A024616 extends A024614 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!super.next().isEven()) {
        return Z.valueOf(mN);
      }
    }
  }
}
