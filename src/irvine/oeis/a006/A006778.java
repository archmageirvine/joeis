package irvine.oeis.a006;

/**
 * A006778 Number of n-step spirals on hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A006778 extends A006777 {

  protected int model() {
    return 3;
  }

  protected long count(final int point, final int n, final int theta, final int u, final int k) {
    mPath[n] = point;
    if (n == mN) {
      mU[k] = u;
      return isSingle(k) ? 1 : 0;
    }
    long count = 0;
    int limit = theta + model();
    if (limit >= DELTAS.length) {
      limit -= DELTAS.length;
    }
    int t = theta;
    int step = 0;
    do {
      final int newPoint = point + DELTAS[t];
      if (check(newPoint, n, k)) {
        switch (step) {
          case 0:
            count += count(newPoint, n + 1, t, u + 1, k);
            break;
          case 1:
            mU[k] = u;
            count += count(newPoint, n + 1, t, 1, k + 1);
            break;
          default: // 2
            mU[k] = u;
            mU[k + 1] = 0;
            count += count(newPoint, n + 1, t, 1, k + 2);
            break;
        }
      }
      ++step;
      if (++t == DELTAS.length) {
        t = 0; // mod
      }
    } while (t != limit);
    return count;
  }
}
