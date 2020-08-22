package irvine.oeis.a020;

/**
 * A020936 Greatest k such that (k-th prime) &lt; (6 times n-th prime).
 * @author Sean A. Irvine
 */
public class A020936 extends A020901 {

  @Override
  protected long scale() {
    return 6;
  }
}
