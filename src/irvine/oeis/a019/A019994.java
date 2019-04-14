package irvine.oeis.a019;

/**
 * A019994.
 * @author Sean A. Irvine
 */
public class A019994 extends A019993 {

  @Override
  protected long select(final long n, final long best) {
    return best + n;
  }
}
