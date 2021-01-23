package irvine.oeis.a036;

/**
 * A036768 Number of ordered rooted trees with n non-root nodes and all outdegrees &lt;= six.
 * @author Sean A. Irvine
 */
public class A036768 extends A036766 {

  @Override
  protected long r() {
    return 6;
  }
}
