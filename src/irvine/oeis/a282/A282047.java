package irvine.oeis.a282;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a013.A013969;
import irvine.oeis.a037.A037946;

/**
 * A282047 Coefficients in q-expansion of E_4^4*E_6, where E_4 and E_6 are respectively the Eisenstein series A004009 and A013973.
 * @author Georg Fischer
 */
public class A282047 extends Sequence0 {

  private int mN = -1;
  private final A013969 mSeq1 = new A013969();
  private final A037946 mSeq2 = new A037946();

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ONE : mSeq1.next().multiply(-552).add(mSeq2.next().multiply(35424000)).divide(77683);
  }
}
