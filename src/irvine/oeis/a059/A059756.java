package irvine.oeis.a059;

import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059756 Erd\u0151s-Woods numbers: the length of an interval of consecutive integers with property that every element has a factor in common with one of the endpoints.
 * @author Sean A. Irvine
 */
public class A059756 implements Sequence {

  // After Bertram Felgenhauer

  protected final Fast mPrime = new Fast();
  private int mN = 15;

  protected ISolver buildSolver(final int n) {
    int pi = 0;
    for (long p = 2; p < n; p = mPrime.nextPrime(p)) {
      ++pi;
    }
    final ISolver s = SolverFactory.newDefault();
    s.newVar(2 * pi);
    s.setExpectedNumberOfClauses(pi + n);
    long p = 2;
    for (int i = 1; p < n; ++i, p = mPrime.nextPrime(p)) {
      try {
        final VecInt v = new VecInt();
        v.push(-(2 * i));
        v.push(-(2 * i + 1));
        s.addClause(v);
      } catch (final ContradictionException e) {
        throw new RuntimeException(e);
      }
    }
    // prepare clauses for each m by enumerating multiples (like sieving)
    p = 2;
    final VecInt[] c = new VecInt[n];
    for (int k = 0; k < c.length; ++k) {
      c[k] = new VecInt();
    }
    for (int j = 1; p < n; ++j, p = mPrime.nextPrime(p)) {
      for (long q = p; q < n; q += p) {
        c[(int) q].push(2 * j);
      }
      for (long q = n - p; q > 0; q -= p) {
        c[(int) q].push(2 * j + 1);
      }
    }
    for (final VecInt v : c) {
      if (!v.isEmpty()) {
        try {
          s.addClause(v);
        } catch (final ContradictionException e) {
          throw new RuntimeException(e);
        }
      }
    }
    return s;
  }

  private boolean is(final int n) {
    try {
      return buildSolver(n).isSatisfiable();
    } catch (final TimeoutException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
