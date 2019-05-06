package irvine.oeis.a020;

/**
 * A020938 Greatest k such that <code>(k-th</code> prime) <code>&lt; (8</code> times <code>n-th</code> prime).
 * @author Sean A. Irvine
 */
public class A020938 extends A020901 {

  @Override
  protected long scale() {
    return 8;
  }
}
