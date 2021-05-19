package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001764;

/**
 * A047754 Number of dissectable polyhedra with symmetry of type H.
 * @author Sean A. Irvine
 */
public class A047754 extends A001764 {

  private final Sequence mA = new A047751();
  private final Sequence mB = new A047753();
  private long mN = 0;

  @Override
  public Z next() {
    final Z t = mA.next().add(mB.next());
    if ((++mN & 3) != 1) {
      return Z.ZERO;
    } else {
      return super.next().subtract(t).divide2();
    }
  }
}

