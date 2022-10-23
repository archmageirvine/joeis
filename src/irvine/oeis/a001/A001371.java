package irvine.oeis.a001;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000029;

/**
 * A001371 Number of n-bead necklaces with beads of 2 colors and primitive period n, when turning over is allowed.
 * @author Sean A. Irvine
 */
public class A001371 extends Sequence0 {

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
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      s = s.add(a29(mN / d).multiply(Mobius.mobius(d)));
    }
    return s;
  }
}
