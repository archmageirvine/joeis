package irvine.oeis.a020;

/**
 * A020939 Greatest k such that (k-th prime) &lt; (9 times n-th prime).
 * @author Sean A. Irvine
 */
public class A020939 extends A020901 {

  @Override
  protected long scale() {
    return 9;
  }
}
