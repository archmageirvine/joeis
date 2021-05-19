package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001764;

/**
 * A047758 Number of dissectable polyhedra with symmetry of type G.
 * @author Sean A. Irvine
 */
public class A047758 extends A001764 {

  private final Sequence mA = new A047751();
  private final Sequence mB = new A047752();
  private final Sequence mC = new A047753();
  private long mN = 0;

  @Override
  public Z next() {
    final Z t = mA.next().add(mB.next().multiply2()).add(mC.next().multiply(3));
    if ((++mN & 3) != 1) {
      return Z.ZERO;
    } else {
      return super.next().subtract(t).divide(6);
    }
  }
}

