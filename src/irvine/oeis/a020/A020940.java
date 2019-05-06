package irvine.oeis.a020;

/**
 * A020940 Greatest k such that <code>(k-th</code> prime) <code>&lt; (10</code> times <code>n-th</code> prime).
 * @author Sean A. Irvine
 */
public class A020940 extends A020901 {

  @Override
  protected long scale() {
    return 10;
  }
}
