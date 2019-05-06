package irvine.oeis.a020;

/**
 * A020936 Greatest k such that <code>(k-th</code> prime) <code>&lt; (6</code> times <code>n-th</code> prime).
 * @author Sean A. Irvine
 */
public class A020936 extends A020901 {

  @Override
  protected long scale() {
    return 6;
  }
}
