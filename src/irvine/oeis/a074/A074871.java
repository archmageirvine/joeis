package irvine.oeis.a074;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a171.A171765;

/**
 * A074871 Start with n and repeatedly apply the map k -&gt; T(k) = A053837(k) + A171765(k); a(n) is the number of steps (at least one) until a prime is reached, or 0 if no prime is ever reached.
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
