package irvine.oeis.a038;

/**
 * A038026 Last position reached by winner of n-th Littlewood Frog Race.
 * @author Sean A. Irvine
 */
public class A038026 extends A038025 {

  @Override
  protected long select(final long a, final long phimax) {
    return phimax * mN + a;
  }
}
