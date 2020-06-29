package irvine.oeis.a032;

/**
 * A032905 Numbers whose <code>base-8</code> representation <code>Sum_{i=0..m} d(i)*8^i</code> has <code>d(0) &lt;= d(1) &gt;= d(2) &lt;= ..</code>.
 * @author Sean A. Irvine
 */
public class A032905 extends A032899 {

  @Override
  protected int base() {
    return 8;
  }
}
