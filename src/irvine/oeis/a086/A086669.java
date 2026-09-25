package irvine.oeis.a086;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003658;

/**
 * A086669 a(n) = number of divisors of n that are fundamental discriminants.
 * @author Sean A. Irvine
 */
public class A086669 extends Sequence1 {

  private long mN = 0;
  private final Sequence mA = new A003658();
  private final TreeSet<Z> mD = new TreeSet<>();
  {
    mD.add(mA.next()); // make sure tree is non-empty
  }

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      while (d.compareTo(mD.last()) > 0) {
        mD.add(mA.next());
      }
      if (mD.contains(d)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
