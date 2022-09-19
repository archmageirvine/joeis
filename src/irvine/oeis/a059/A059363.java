package irvine.oeis.a059;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A059363 Lexicographically earliest increasing sequence of positive integers such that A001222(a(i)+a(j)) = A001222(a(i)) + A001222(a(j)) for all 1&lt;=i&lt;j.
 * @author Sean A. Irvine
 */
public class A059363 extends MemorySequence {

  private final ArrayList<Long> mOmegas = new ArrayList<>(); // precomputed omega for sequence values

  private boolean isOk(final long m, final long omegaM) {
    for (int k = size() - 1; k >= 0; --k) {
      final long v = get(k).longValueExact();
      final long a = mOmegas.get(k);
      final long b = Jaguar.factor(m + v).bigOmega();
      if (a + omegaM != b) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      mOmegas.add(0L);
      return Z.ONE;
    }
    long m = get(n - 1).longValueExact();
    while (true) {
      final long omegaM = Jaguar.factor(++m).bigOmega();
      if (isOk(m, omegaM)) {
        mOmegas.add(omegaM);
        return Z.valueOf(m);
      }
    }
  }
}
