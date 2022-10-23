package irvine.oeis.a043;
// manually 2021-03-01
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A043097 Numbers k such that 0 and 1 occur juxtaposed in the base-3 representation of k but not of k-1.
 * @author Georg Fischer
 */
public class A043097 extends Sequence1 {

  private static final String P12 = String.valueOf(0) + String.valueOf(1);
  private static final String P21 = String.valueOf(1) + String.valueOf(0);
  private int mN = 1;
  private Z mK = Z.ZERO;

  @Override
  public Z next() {
    int loopCheck = 1000000;
    while (loopCheck > 0) {
      mK = mK.add(Z.ONE);
      final String sta = mK.toString(3);
      final String stb = mK.subtract(Z.ONE).toString(3);
      if ((sta.contains(P12) || sta.contains(P21))
        && (!stb.contains(P12) && !stb.contains(P21))) { // isOk
        --loopCheck;
        break;
      }
      --loopCheck;
    } // while busy
    ++mN;
    if (loopCheck == 0) {
      throw new IllegalArgumentException("more than 10^6 iterations in A043097");
    }
    return mK;
  }
}
