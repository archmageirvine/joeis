package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047760 Number of dissectable polyhedra with n tetrahedral cells and symmetry of type F.
 * @author Sean A. Irvine
 */
public class A047760 extends A047750 {

  private final Sequence mA = new A047751();
  private final Sequence mB = new A047753();
  private long mN = 0;

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    final Z t = mA.next().add(mB.next());
    if ((++mN & 1) != 1) {
      return Z.ZERO;
    } else {
      return super.next().subtract(t).divide2();
    }
  }
}

