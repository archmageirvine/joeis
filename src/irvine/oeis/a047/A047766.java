package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001764;

/**
 * A047766 Number of dissectable polyhedra with symmetry of type O.
 * @author Sean A. Irvine
 */
public class A047766 extends A001764 {

  private final Sequence mA = new A047764();
  private long mN = 0;

  @Override
  public Z next() {
    final Z a = mA.next();
    return (++mN % 6) != 2 ? Z.ZERO : super.next().subtract(a).divide2();
  }
}

