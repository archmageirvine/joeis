package irvine.oeis.a007;

import java.util.TreeSet;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007755.
 * @author Sean A. Irvine
 */
public class A007755 extends MemoryFunction1<TreeSet<Z>> implements Sequence {

  // After T. D. Noe
  // I omit the alpha of Noe and instead simply limit each S_n to MAX_SIZE elements

  private static final int MAX_SIZE = 40;
  private int mN = -2;

  private TreeSet<Z> primes(final int n, final Z limit) {
    final TreeSet<Z> primes = new TreeSet<>();
    for (int k = 1; k <= n; ++k) {
      for (final Z v : get(n - k)) {
        final Z u = v.shiftLeft(k).add(1);
        if (u.compareTo(limit) > 0) {
          break;
        }
        if (u.isProbablePrime()) {
          primes.add(u);
        }
      }
    }
    return primes;
  }

  private TreeSet<Z> composites(final int n, final Z limit) {
    final TreeSet<Z> composites = new TreeSet<>();
    for (int k = 1; k < n; ++k) {
      for (final Z u : get(k)) {
        for (final Z v : get(n - k)) {
          final Z w = u.multiply(v);
          if (w.compareTo(limit) > 0) {
            break;
          }
          composites.add(w);
        }
      }
    }
    return composites;
  }

  private TreeSet<Z> s(final int n) {
    final Z limit = Z.ONE.shiftLeft(n + 1);
    final TreeSet<Z> s = primes(n, limit);
    while (s.size() > MAX_SIZE) {
      s.pollLast();
    }
    s.addAll(composites(n, limit));
    while (s.size() > MAX_SIZE) {
      s.pollLast();
    }
    return s;
  }

  @Override
  protected TreeSet<Z> compute(final int n) {
    if (n == 0) {
      final TreeSet<Z> s = new TreeSet<>();
      s.add(Z.ONE);
      return s;
    }
    return s(n);
  }

  @Override
  public Z next() {
    if (++mN <= 0) {
      return mN == 0 ? Z.TWO : Z.ONE;
    }
    return get(mN).first();
  }
}

