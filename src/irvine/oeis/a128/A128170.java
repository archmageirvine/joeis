package irvine.oeis.a128;

/**
 * A128170 Numbers n such that n divides <code>1 +</code> sum_{1 <code>&lt;=</code> k <code>&lt;= n}</code> prime(k)^6.
 * @author Sean A. Irvine
 */
public class A128170 extends A128171 {

  @Override
  protected int power() {
    return 6;
  }
}
