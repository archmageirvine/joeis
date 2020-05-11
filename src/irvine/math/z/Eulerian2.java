package irvine.math.z;

import irvine.math.MemoryFunction2;

/**
 * Compute Eulerian numbers of the second kind.
 * @author Sean A. Irvine
 */
public final class Eulerian2 extends MemoryFunction2<Long, Z> {

  /** Singleton object for holding Eulerian numbers of the second kind. */
  public static final Eulerian2 SINGLETON = new Eulerian2();

  private Eulerian2() { }

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0) {
      return Z.ONE;
    }
    if (n == 1) {
      return Z.ZERO;
    }
    return get(n - 1, m).multiply(m + 1).add(get(n - 1, m - 1).multiply(2 * n - m - 1));
  }
}
