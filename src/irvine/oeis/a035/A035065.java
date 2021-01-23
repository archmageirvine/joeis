package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a034.A034886;

/**
 * A035065 Numbers k such that k! has a prime number of digits.
 * @author Sean A. Irvine
 */
public class A035065 extends A034886 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
