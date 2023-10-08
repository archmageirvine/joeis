package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066322.
 * @author Sean A. Irvine
 */
public class A066330 extends Sequence0 {

  private static final String[] A = {"", "", "", "0000", "0001", "0010", "0011", "0100", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
  private long mN = 0;
  private int mM = 2;

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
