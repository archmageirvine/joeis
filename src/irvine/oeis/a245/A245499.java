package irvine.oeis.a245;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A245499 Table read by rows: n-th row contains the factors which occur when constructing R. L. Graham's sequence A006255, such that the number of factors and also the product is minimal.
 * @author Sean A. Irvine
 */
public class A245499 extends Sequence1 {

  private long mN = 0;
  protected final TreeSet<Z> mA = new TreeSet<>();

  private boolean isSquare(final long n) {
    final long s = Functions.SQRT.l(n);
    return s * s == n;
  }

  private boolean isSquare(final Z n) {
    return n.sqrtAndRemainder()[1].isZero();
  }

  protected void step() {
    mA.clear();
    final Z n = Z.valueOf(++mN);
    final TreeMap<Z, Z> products = new TreeMap<>();
    products.put(n, n);
    mA.add(n);
    if (isSquare(mN)) {
      return;
    }
    long k = 0;
    outer:
    while (true) {
      final Z next = Z.valueOf(mN + ++k);
      final HashMap<Z, Z> newTerms = new HashMap<>();
      for (final Z q : products.keySet()) {
        Z p = q.multiply(next);
        newTerms.put(p, next);
        if (isSquare(p)) {
          products.putAll(newTerms);
          while (!p.equals(n)) {
            final Z r = products.get(p);
            mA.add(r);
            p = p.divide(r);
          }
          break outer;
        }
      }
      products.putAll(newTerms);
    }
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      step();
    }
    return mA.pollFirst();
  }
}
