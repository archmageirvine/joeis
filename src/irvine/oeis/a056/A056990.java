package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a055.A055165;

/**
 * A056990 Number of nonsingular n X n (-1,1)-matrices.
 * @author Sean A. Irvine
 */
public class A056990 extends Sequence0 {

  private final Sequence mA = new A055165();
  private long mN = -3;

  @Override
  public Z next() {
    mN += 2;
    return mN <= 0 ? Z.ONE : mA.next().shiftLeft(mN);
  }
}
