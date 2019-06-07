package irvine.oeis.a002;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.Mobius;

import java.util.ArrayList;

/**
 * A002730 Number of equivalence classes of binary sequences of primitive period <code>n</code>.
 * @author Sean A. Irvine
 */
public class A002730 extends A002729 {

  private final ArrayList<Z> mA2729 = new ArrayList<>();
  {
    mA2729.add(super.next());
  }

  @Override
  public Z next() {
    final int n = mA2729.size();
    mA2729.add(super.next());
    Z s = Z.ZERO;
    for (final Z dd : Cheetah.factor(n).divisors()) {
      final int d = dd.intValueExact();
      s = s.add(mA2729.get(d).multiply(Mobius.mobius(n / d)));
    }
    return s;
  }
}
