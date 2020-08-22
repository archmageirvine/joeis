package irvine.oeis.a020;

/**
 * A020937 Greatest k such that (k-th prime) &lt; (7 times n-th prime).
 * @author Sean A. Irvine
 */
public class A020937 extends A020901 {

  @Override
  protected long scale() {
    return 7;
  }
}
