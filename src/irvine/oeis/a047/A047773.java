package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A047773 Number of dissectable polyhedra with symmetry of type D.
 * @author Sean A. Irvine
 */
public class A047773 extends Sequence1 {

  private final Sequence mA = new A047751();
  private final Sequence mB = new A047764();
  private final Sequence mC = new A047749();
  private final Sequence mD = new A047750();
  private long mN = 0;

  @Override
  public Z next() {
    final Z t = mA.next().multiply2().add(mB.next());
    final long r = ++mN % 3;
    if (r == 1) {
      final Z u = mC.next();
      return mN == 1 ? Z.ZERO : u;
    } else if (r == 2) {
      return mD.next().subtract(t).divide2();
    } else {
      return Z.ZERO;
    }
  }
}
