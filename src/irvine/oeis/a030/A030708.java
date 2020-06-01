package irvine.oeis.a030;

/**
 * A030708 Row 2, where, at stage <code>k&gt;1</code>, write i in row 1 and j in row 2, where i is the number of j's in rows 1 and 2, for <code>j=1,2,...,m</code>, where <code>m=max</code> number in row 1 for stages 1 to <code>j-1;</code> stage 1 is 1 in row 1.
 * @author Sean A. Irvine
 */
public class A030708 extends A030707 {

  @Override
  protected long select(final long a, final long b) {
    return b;
  }
}
