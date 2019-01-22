package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.Mobius;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000029;

import java.util.ArrayList;

/**
 * A001371.
 * @author Sean A. Irvine
 */
public class A001371 implements Sequence {

  private final ArrayList<Z> mA = new ArrayList<>();
  private final Sequence mA29 = new A000029();
  private int mN = -1;

  private Z a29(final int n) {
    while (n >= mA.size()) {
      mA.add(mA29.next());
    }
    return mA.get(n);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValue();
      s = s.add(a29(mN / d).multiply(Mobius.mobius(d)));
    }
    return s;
  }
}
