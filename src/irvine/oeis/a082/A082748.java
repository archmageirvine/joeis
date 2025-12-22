package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A082748 Rearrangement of natural numbers disturbing the position of every number such that a(n) is coprime to a(m) if n is coprime to m. (a(n),a(m)) = 1 if (n,m) = 1.
 * @author Sean A. Irvine
 */
public class A082748 extends CachedSequence {

  private final TreeSet<Long> mUsed = new TreeSet<>();
  private long mLeastUnused = 3;

  /** Construct the sequence. */
  public A082748() {
    super(1);
  }

  @Override
  protected Z compute(final Z nn) {
    final long n = nn.longValueExact();
    if (n == 1) {
      return Z.TWO;
    }
    if (n == 2) {
      return Z.ONE;
    }
    while (mUsed.remove(mLeastUnused)) {
      mLeastUnused += 2;
    }
    long k = mLeastUnused;
    while (true) {
      if (!mUsed.contains(k) && k != n) {
        long m = 3;
        boolean works = true;
        while (m < n) {
          if (Functions.GCD.l(m, n) == 1 && Functions.GCD.l(a((int) m), k) != 1) {
            works = false;
            break;
          }
          ++m;
        }
        if (works) {
          mUsed.add(k);
          return Z.valueOf(k);
        }
      }
      k += 2;
    }
  }
}
