package irvine.oeis.a073;

/**
 * A073158 a() = 1,2,4,7,... [ A073158 ], adjacent sums = 3,6,11... [ A073159 ] and 2nd adjacent sums = 9,17,... [ A073160 ] are disjoint but not monotonic; adjoin next free number to A073158 to construct three sequences that together include all positive integers.
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
