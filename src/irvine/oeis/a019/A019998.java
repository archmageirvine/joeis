package irvine.oeis.a019;

/**
 * A019998 From George Gilbert's marks problem: jumping 7 marks at a time (final positions).
 * @author Sean A. Irvine
 */
public class A019998 extends A019997 {

  @Override
  protected long select(final long n, final long best) {
    return best + n;
  }
}
