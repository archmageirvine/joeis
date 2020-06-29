package irvine.oeis.a032;

/**
 * A032899 Numbers whose <code>base-2</code> representation <code>Sum_{i=0..m} d(i)*2^i</code> has <code>d(0) &lt;= d(1) &gt;= d(2) &lt;= ..</code>.
 * @author Sean A. Irvine
 */
public class A032899 extends A032890 {

  @Override
  protected int initialDirection() {
    return 1;
  }
}
