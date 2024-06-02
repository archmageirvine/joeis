package irvine.oeis.a070;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070167 a(n) is the smallest starting value that produces a Collatz sequence in which n occurs.
 * @author Sean A. Irvine
 */
public class A070167 extends Sequence1 {

  private final HashMap<Z, Long> mFirsts = new HashMap<>();
  private Z mN = Z.ZERO;
  private long mM = 0;

  @Override
  public Z next() {
    mN = mN.add(1);
    while (mFirsts.get(mN) == null) {
      Z f = Z.valueOf(++mM);
      while (true) {
        if (f.compareTo(mN) >= 0) {
          mFirsts.putIfAbsent(f, mM);
        }
        if (Z.ONE.equals(f)) {
          break;
        }
        f = f.isEven() ? f.divide2() : f.multiply(3).add(1);
      }
    }
    return Z.valueOf(mFirsts.remove(mN));
  }
}
