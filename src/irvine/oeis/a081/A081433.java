package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081433 Numbers n such that RevBinary(RevDecimal(n))=RevDecimal(RevBinary(n)), where RevDecimal(n) is the decimal reversal of n (A004086) and RevBinary(n) is the binary reversal of n (A030101).
 * @author Sean A. Irvine
 */
public class A081433 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.REVERSE.z(2, Functions.REVERSE.l(++mN)).equals(Functions.REVERSE.z(Functions.REVERSE.z(2, mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
