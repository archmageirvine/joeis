package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003714 Fibbinary numbers: if n = F(i1) + F(i2) + ... + F(ik) is the Zeckendorf representation of n (i.e., write n in Fibonacci number system) then a(n) = 2^(i1 - 2) + 2^(i2 - 2) + ... + 2^(ik - 2). Also numbers whose binary representation contains no two adjacent 1's.
 * @author Sean A. Irvine
 */
public class A003714 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if ((++mN & (mN >>> 1)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
