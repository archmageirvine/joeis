package irvine.oeis.a020;

/**
 * A020935 Greatest k such that <code>(k-th</code> prime) <code>&lt; (5</code> times <code>n-th</code> prime).
 * @author Sean A. Irvine
 */
public class A020935 extends A020901 {

  @Override
  protected long scale() {
    return 5;
  }
}
