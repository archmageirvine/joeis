package irvine.oeis.a020;

/**
 * A020934 Greatest k such that <code>(k-th</code> prime) <code>&lt; (4</code> times <code>n-th</code> prime).
 * @author Sean A. Irvine
 */
public class A020934 extends A020901 {

  @Override
  protected long scale() {
    return 4;
  }
}
