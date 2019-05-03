package irvine.oeis.a019;

/**
 * A019596 From George Gilbert's marks problem: jumping 4 marks at a time <code>(final positions)</code>.
 * @author Sean A. Irvine
 */
public class A019596 extends A019595 {

  @Override
  protected long select(final long n, final long best) {
    return best + n;
  }
}
