package irvine.oeis.a282;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a013.A013965;
import irvine.oeis.a037.A037944;

/**
 * A282000 Coefficients in q-expansion of E_4^3*E_6, where E_4 and E_6 are respectively the Eisenstein series A004009 and A013973.
 * @author Georg Fischer
 */
public class A282000 extends Sequence0 {

  private int mN = -1;
  private final A013965 mSeq1 = new A013965();
  private final A037944 mSeq2 = new A037944();

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ONE : mSeq1.next().multiply(-28728).add(mSeq2.next().multiply(9504000)).divide(43867);
  }
}
