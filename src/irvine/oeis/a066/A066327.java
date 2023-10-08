package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066322.
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
