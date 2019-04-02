package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a121.A121666;
import irvine.oeis.a123.A123653;

/**
 * A007254 McKay-Thompson series of class 6A for Monster.
 * @author Sean A. Irvine
 */
public class A007254 extends A121666 {

  private Sequence mA = new PrependSequence(new A123653(), Z.ZERO, Z.ZERO);
  private long mN = -1;

  @Override
  public Z next() {
    final Z res = super.next().add(mA.next().multiply(64));
    return ++mN == 1 ? Z.ZERO : res;
  }
}
