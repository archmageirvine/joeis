package irvine.oeis.a393;

import java.util.HashSet;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.a007.A007310;

/**
 * A393012 allocated for David A. Corneth.
 * @author Sean A. Irvine
 */
public class A393012 extends A007310 {

  private final HashSet<Z> mSignatures = new HashSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z sig = FactorUtils.leastPrimeSignature(t);
      if (mSignatures.add(sig)) {
        return t;
      }
    }
  }
}
