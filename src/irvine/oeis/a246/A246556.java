package irvine.oeis.a246;

import java.util.Arrays;
import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000129;

/**
 * A246556 a(n) = smallest prime which divides Pell(n) = A000129(n) but does not divide any Pell(k) for k&lt;n, or -1 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A246556 extends A000129 {

  private final HashSet<Z> mPrimitives = new HashSet<>();
  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z[] factors = Jaguar.factor(super.next()).toZArray();
    for (final Z p : factors) {
      if (!mPrimitives.contains(p)) {
        mPrimitives.addAll(Arrays.asList(factors));
        return p;
      }
    }
    return Z.NEG_ONE;
  }
}
