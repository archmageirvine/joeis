package irvine.oeis.a019;

/**
 * A019593 From George Gilbert's marks problem: jumping 3 marks at a time (initial positions).
 * @author Sean A. Irvine
 */
public class A019593 extends A019592 {

  @Override
  protected long select(final long n, final long best) {
    return best + n;
  }
}
