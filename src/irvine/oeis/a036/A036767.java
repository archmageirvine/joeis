package irvine.oeis.a036;

/**
 * A036767 Number of ordered rooted trees with n non-root nodes and all outdegrees &lt;= five.
 * @author Sean A. Irvine
 */
public class A036767 extends A036766 {

  @Override
  protected long r() {
    return 5;
  }
}
