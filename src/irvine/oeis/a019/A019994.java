package irvine.oeis.a019;

/**
 * A019994 From George Gilbert's marks problem: jumping 5 marks at a time (final positions).
 * @author Sean A. Irvine
 */
public class A019994 extends A019993 {

  @Override
  protected long select(final long n, final long best) {
    return best + n;
  }
}
