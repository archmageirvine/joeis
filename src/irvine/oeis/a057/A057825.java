package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A057825 Values of k for which A003418(k) - 1 is prime.
 * @author Georg Fischer
 */
public class A057825 extends A003418 {

  private int mK = -1;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      ++mK;
      if (super.next().subtract(1).isProbablePrime()) {
        return Z.valueOf(mK);
      }
    }
  }
}
