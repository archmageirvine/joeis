package irvine.oeis.a019;

/**
 * A019998.
 * @author Sean A. Irvine
 */
public class A019998 extends A019997 {

  @Override
  protected long select(final long n, final long best) {
    return best + n;
  }
}
