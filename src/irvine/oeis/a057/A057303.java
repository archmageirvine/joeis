package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057303 Numbers n such that the number of distinct digits in n is a digit of n.
 * @author Sean A. Irvine
 */
public class A057303 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long n = ++mN;
      final int syndrome = Functions.SYNDROME.i(n);
      if ((syndrome & (1 << Long.bitCount(syndrome))) != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
