package irvine.oeis.a048;

/**
 * A048131 Becomes prime or 4 after exactly 9 iterations of f(x) = sum of prime factors of x.
 * @author Sean A. Irvine
 */
public class A048131 extends A048124 {

  @Override
  protected int iterations() {
    return 9;
  }
}
