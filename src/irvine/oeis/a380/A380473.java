package irvine.oeis.a380;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003557;
import irvine.oeis.a006.A006530;
import irvine.oeis.a053.A053669;
import irvine.oeis.a119.A119288;

/**
 * A380473 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A380473 extends Sequence1 {

  private final Sequence mA = new A119288();
  private final Sequence mB = new A003557();
  private final Sequence mC = new A053669();
  private final Sequence mD = new A006530();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z a = mA.next();
      final Z b = mB.next();
      final Z c = mC.next();
      final Z d = mD.next();
      if (a.compareTo(b) <= 0 && b.compareTo(c) < 0 && c.compareTo(d) < 0 && !Predicates.SQUARE_FREE.is(mN) && !Predicates.PRIME_POWER.is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
