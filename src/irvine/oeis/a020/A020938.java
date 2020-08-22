package irvine.oeis.a020;

/**
 * A020938 Greatest k such that (k-th prime) &lt; (8 times n-th prime).
 * @author Sean A. Irvine
 */
public class A020938 extends A020901 {

  @Override
  protected long scale() {
    return 8;
  }
}
