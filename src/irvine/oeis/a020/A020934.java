package irvine.oeis.a020;

/**
 * A020934 Greatest k such that (k-th prime) &lt; (4 times n-th prime).
 * @author Sean A. Irvine
 */
public class A020934 extends A020901 {

  @Override
  protected long scale() {
    return 4;
  }
}
