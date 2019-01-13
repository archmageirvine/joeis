package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A001837.
 * @author Sean A. Irvine
 */
public class A001837 extends A000010 {

  private long mN = 0;

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z a = super.next();
      final Z b = super.next();
      if (b.compareTo(a) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
