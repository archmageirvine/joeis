package irvine.oeis.a108;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a073.A073053;

/**
 * A108064 Numbers n such that DENEAT(n^n) is prime, where DENEAT(n) = concatenate number of even digits in n, number of odd digits and total number of digits.
 * @author Georg Fischer
 */
public class A108064 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (A073053.deneat(Z.valueOf(mN).pow(mN)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
