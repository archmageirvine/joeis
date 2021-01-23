package irvine.oeis.a020;

/**
 * A020940 Greatest k such that (k-th prime) &lt; (10 times n-th prime).
 * @author Sean A. Irvine
 */
public class A020940 extends A020901 {

  @Override
  protected long scale() {
    return 10;
  }
}
