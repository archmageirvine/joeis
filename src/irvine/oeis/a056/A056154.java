package irvine.oeis.a056;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A056154 Numbers n such that the number of times each digit occurs in 2^n, represented in base 3, is the same as 2^(n+1), also represented in base 3. Or in other words, when represented in base 3, the digits in 2^n can be rearranged to form 2^(n+1).
 * @author Sean A. Irvine
 */
public class A056154 extends Sequence1 {

  private int mN = 4;
  private Z mA = Z.valueOf(32);

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z b = mA.multiply2();
      if (Arrays.equals(ZUtils.digitCounts(mA, 3), ZUtils.digitCounts(b, 3))) {
        mA = b;
        return Z.valueOf(mN);
      }
      mA = b;
    }
  }
}

