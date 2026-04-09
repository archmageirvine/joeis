package irvine.oeis.a084;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084384 a(1) = 2; a(n+1) = smallest k &gt; a(n) that is divisible by at most (1/2)*[tau(k)] previous terms.
 * @author Sean A. Irvine
 */
public class A084384 extends Sequence1 {

  // After Charles R Greathouse IV

  private long mN = 1;

  private boolean has(final List<Integer> e) {

    // Remove zeros
    final List<Integer> f = new ArrayList<>();
    for (final int v : e) {
      if (v != 0) {
        f.add(v);
      }
    }

    // Base cases
    if (f.isEmpty()) {
      return false;
    }
    if (f.size() == 1 && f.get(0) < 4) {
      return true;
    }

    // Compute t = product(f[i] + 1) / 2
    long t = 1;
    for (final int v : f) {
      t *= v + 1;
    }
    t /= 2;

    // Prepare vector iteration
    final int k = f.size();
    final int[] x = new int[k];

    while (true) {
      // Check if x == f
      boolean equal = true;
      for (int i = 0; i < k; ++i) {
        if (x[i] != f.get(i)) {
          equal = false;
          break;
        }
      }
      if (equal) {
        return true;
      }

      // Convert x to list and recurse
      final List<Integer> sub = new ArrayList<>(k);
      for (int i = 0; i < k; ++i) {
        sub.add(x[i]);
      }

      if (has(sub) && --t < 0) {
        return false;
      }

      // Increment vector x (like forvec)
      int i = 0;
      while (i < k) {
        if (x[i] < f.get(i)) {
          x[i]++;
          break;
        } else {
          x[i++] = 0;
        }
      }
    }
  }

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    final List<Integer> e = new ArrayList<>();
    for (final Z p : fs.toZArray()) {
      e.add(fs.getExponent(p));
    }
    return has(e);
  }

  @Override
  public Z next() {
    if (mN == 1) {
      ++mN;
      return Z.TWO;
    }
    while (!is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
