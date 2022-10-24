package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a075.A075059;

/**
 * A049537 Values of k for which A075059(k) = A003418(k) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A049537 extends A075059 {

  private long mN = -1;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = super.next();
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

