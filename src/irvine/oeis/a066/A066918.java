package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001223;
import irvine.util.array.DynamicLongArray;

/**
 * A066918 a(n) = least natural number k such that f(k) begins a maximal zigzag of length n in the prime gaps function f(x) = p(x+1)-p(x), where p(x) denotes the x-th prime. (Cf. A066485.).
 * @author Sean A. Irvine
 */
public class A066918 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final Sequence mGaps = new A001223();
  private Z mG1 = mGaps.next();
  private Z mG2 = mGaps.next();
  private int mN = 0;
  private long mM = 1;
  private int mL = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final Z g0 = mG1;
      mG1 = mG2;
      mG2 = mGaps.next();
      ++mM;
      final Z t = mG1.subtract(g0).multiply(mG1.subtract(mG2));
      if (t.signum() > 0) {
        ++mL;
      } else {
        if (mFirsts.get(mL) == 0) {
          mFirsts.set(mL, mM - mL);
        }
        mL = 0;
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
