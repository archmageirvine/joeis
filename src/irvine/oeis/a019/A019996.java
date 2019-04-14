package irvine.oeis.a019;

/**
 * A019996.
 * @author Sean A. Irvine
 */
public class A019996 extends A019995 {

  @Override
  protected long select(final long n, final long best) {
    return best + n;
  }
}
