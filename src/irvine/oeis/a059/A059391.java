package irvine.oeis.a059;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.util.string.StringUtils;

/**
 * A059391 a(1)=4; a(n) is the smallest number m &gt; a(n-1) such that Omega(m + a(i)) = Omega(m) - Omega(a(i)) for i = 1..(n-1) where Omega(k) is the number of prime divisors of k counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A059391 extends MemorySequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final ArrayList<Long> mOmegas = new ArrayList<>(); // precomputed omega for sequence values
  private final Z mStart;

  protected A059391(final long start) {
    mStart = Z.valueOf(start);
    setOffset(1);
  }

  /** Construct the sequence. */
  public A059391() {
    this(4);
  }

  private boolean isOk(final long m, final long omegaM) {
    for (int k = size() - 1; k >= 0; --k) {
      final long v = a(k).longValueExact();
      final long a = mOmegas.get(k);
      final long b = Functions.BIG_OMEGA.l(m + v);
      if (omegaM - a != b) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      mOmegas.add(Functions.BIG_OMEGA.l(mStart));
      return mStart;
    }
    long m = a(n - 1).longValueExact();
    while (true) {
      final long omegaM = Functions.BIG_OMEGA.l(++m);
      if (isOk(m, omegaM)) {
        mOmegas.add(omegaM);
        return Z.valueOf(m);
      }
      if (mVerbose && m % 100000000 == 0) {
        StringUtils.message("Search complete to " + m);
      }
    }
  }
}
