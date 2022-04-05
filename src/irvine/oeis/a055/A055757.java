package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003785;

/**
 * A055757 Jacobi form of weight 12 and index 1 for Niemeier lattice of type E_6^4 or A_11 D_7 E_6.
 * @author Sean A. Irvine
 */
public class A055757 extends A055747 {

  private final Sequence mA = new PrependSequence(new A003785(), 0, 0, 0);

  @Override
  public Z next() {
    return super.next().subtract(mA.next().multiply(36));
  }
}
