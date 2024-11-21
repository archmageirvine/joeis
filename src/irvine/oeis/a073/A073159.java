package irvine.oeis.a073;

/**
 * A073159 Sums of adjacent terms of A073158. Together, A073158, A073159 and A073160 include all the positive integers uniquely.
 * @author Sean A. Irvine
 */
public class A073159 extends A073158 {

  {
    super.next(); // first term is 0 in b
  }

  @Override
  protected long select(final long a, final long b, final long c) {
    return b;
  }
}
