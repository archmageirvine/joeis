package irvine.oeis.a080;

/**
 * A080594 Consider the standard game of Nim with 3 heaps and make a list of the losing positions (x,y,z) with x &lt;= y &lt;= z in reverse lexicographic order; sequence gives y values.
 * @author Sean A. Irvine
 */
public class A080594 extends A080593 {

  @Override
  protected long select(final long x, final long y, final long z) {
    return y;
  }
}
