package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066329 Binary string which equals n when 1's, 2's, 4's and 8's bits have weights 1, 1, 3, 5 respectively, while the other bits have their usual weights. -1 if no such string exists.
 * @author Sean A. Irvine
 */
public class A066329 extends Sequence0 {

  private static final String[] A = {"", "", "", "", "", "0000", "0001", "0011", "0100", "0101", "1000", "1001", "1011", "1100", "1101", "1111"};
  private long mN = 0;
  private int mM = 4;

  @Override
  public Z next() {
    if (++mM == 16) {
      ++mN;
      mM = 0;
    }
    final String a = A[mM];
    if (a.isEmpty()) {
      return Z.NEG_ONE;
    }
    return new Z(Long.toBinaryString(mN) + a);
  }
}
