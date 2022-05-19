package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003785;
import irvine.oeis.a055.A055747;

/**
 * A056945 Jacobi form of weight 12 and index 1 associated to a (nonexistent) lattice vector of norm 2 for the Leech lattice.
 * @author Sean A. Irvine
 */
public class A056945 extends A055747 {

  private final Sequence mA = new PrependSequence(new A003785(), 0, 0, 0);

  @Override
  public Z next() {
    return super.next().subtract(mA.next().multiply(60));
  }
}
