package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.Sequence2;

/**
 * A066531.
 * @author Sean A. Irvine
 */
public class A391868 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.TWO;
  private final Sequence mS = new Sequence2() {

    private long mM = 1;
    private Z mB = Z.TWO;

    @Override
    public Z next() {
      if (++mM < 3) {
        return Z.valueOf(mM);
      }
      mB = mB.add(Functions.TRIANGULAR.z(mB.subtract(1)));
      return mB;
    }
  };

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.valueOf(mN);
    }
    mA = mA.add(mS.next()).subtract(1);
    return mA;
  }
}
