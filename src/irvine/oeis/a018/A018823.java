package irvine.oeis.a018;

/**
 * A018823 n is the sum of k nonzero squares for all 4 &lt;= k &lt;= n-14.
 * @author Sean A. Irvine
 */
public class A018823 extends A018820 {

  @Override
  protected int lower() {
    return 4;
  }
}
