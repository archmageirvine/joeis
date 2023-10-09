package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066327 Binary string which equals n when 1's, 2's, 4's and 8's bits have weights -1, 1, 3, 6 respectively, while the other bits have their usual weights. -1 if no such string exists.
 * @author Sean A. Irvine
 */
public class A066327 extends Sequence0 {

  private static final String[] A = {"", "", "", "", "0001", "0000", "0010", "0101", "0100", "0110", "1001", "1000", "1010", "1101", "1100", "1110"};
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
