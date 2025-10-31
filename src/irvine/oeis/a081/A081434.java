package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081434 Numbers such that RevBinary() = RevDecimal(), where RevDecimal(n) is the decimal reversal of n (A004086) and RevBinary(n) is the binary reversal of n (A030101).
 * @author Sean A. Irvine
 */
public class A081434 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.REVERSE.z(2, ++mN).equals(Functions.REVERSE.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
