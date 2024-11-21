package irvine.oeis.a073;

/**
 * A073160 Sums of adjacent terms of A073159. Together, A073158, A073159 and A073160 include all the positive integers uniquely.
 * @author Sean A. Irvine
 */
public class A073160 extends A073158 {

  {
    super.next();
    super.next();
  }

  @Override
  protected long select(final long a, final long b, final long c) {
    return c;
  }
}
