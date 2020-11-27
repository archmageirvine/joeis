package irvine.oeis.a036;

/**
 * A036769 Number of ordered rooted trees with n non-root nodes and all outdegrees &lt;= seven.
 * @author Sean A. Irvine
 */
public class A036769 extends A036766 {

  @Override
  protected long r() {
    return 7;
  }
}
