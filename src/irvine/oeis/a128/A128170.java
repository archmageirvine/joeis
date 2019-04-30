package irvine.oeis.a128;

/**
 * A128170 Numbers n such that n divides <code>1 + sum_{1 &lt;= k &lt;= n} prime(k)^6</code>.
 * @author Sean A. Irvine
 */
public class A128170 extends A128171 {

  @Override
  protected int power() {
    return 6;
  }
}
