package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066335 Binary string which equals n when 1's and 2's bits have negative weights.
 * @author Sean A. Irvine
 */
public class A066335 extends Sequence0 {

  private static final String[] A = {"0011", "0010", "0001", "0000", "0111", "0110", "0101", "0100", "1011", "1010", "1001", "1000", "1111", "1110", "1101", "1100"};
  private long mN = 0;
  private int mM = 2;

  @Override
  public Z next() {
    if (++mM == 16) {
      ++mN;
      mM = 0;
    }
    return new Z(Long.toBinaryString(mN) + A[mM]);
  }
}
