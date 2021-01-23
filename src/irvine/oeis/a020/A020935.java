package irvine.oeis.a020;

/**
 * A020935 Greatest k such that (k-th prime) &lt; (5 times n-th prime).
 * @author Sean A. Irvine
 */
public class A020935 extends A020901 {

  @Override
  protected long scale() {
    return 5;
  }
}
