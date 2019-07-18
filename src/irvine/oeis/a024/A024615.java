package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024615 Positions of even numbers in <code>A024614</code>.
 * @author Sean A. Irvine
 */
public class A024615 extends A024614 {

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
