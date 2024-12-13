package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073580.
 * @author Sean A. Irvine
 */
public class A073655 extends Sequence1 {

  private Z mA = null;
  private final HashSet<Z> mUsed = new HashSet<>();

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      mUsed.add(Z.ONE);
      return Z.ONE;
    }
    long k = 0;
    while (true) {
      final Z t = Functions.TRIANGULAR.z(++k);
      if (mA.add(t).isProbablePrime() && mUsed.add(t)) {
        mA = t;
        return t;
      }
    }
  }
}
