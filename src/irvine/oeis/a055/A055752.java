package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003785;

/**
 * A055752 Jacobi form of weight 12 and index 1 for Niemeier lattice of type A_17*E_7 or D_10*E_7^2.
 * @author Sean A. Irvine
 */
public class A055752 extends A055747 {

  private final Sequence mA = new PrependSequence(new A003785(), 0, 0, 0);

  @Override
  public Z next() {
    return super.next().subtract(mA.next().multiply(24));
  }
}
