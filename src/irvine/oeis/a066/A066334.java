package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066334 Binary string which equals n when 1's, 2's, 4's and 8's bits have weights 1, 2, 4, 2 respectively, while the other bits have their usual weights. -1 if no such string exists.
 * @author Sean A. Irvine
 */
public class A066334 extends Sequence0 {

  private static final String[] A = {"", "", "", "", "", "", "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1110", "1111"};
  private long mN = 0;
  private int mM = 5;

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
