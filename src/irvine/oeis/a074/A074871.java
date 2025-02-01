package irvine.oeis.a074;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a171.A171765;

/**
 * A074851.
 * @author Sean A. Irvine
 */
public class A074871 extends Sequence1 {

  private final DirectSequence mA = new A171765();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    final HashSet<Z> seen = new HashSet<>();
    Z t = mN;
    do {
      t = mA.a(t).add(Functions.DIGIT_SUM.l(t) % 10);
      if (!seen.add(t)) {
        return Z.ZERO;
      }
      ++cnt;
    } while (!t.isProbablePrime());
    return Z.valueOf(cnt);
  }
}
