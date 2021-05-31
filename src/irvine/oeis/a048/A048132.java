package irvine.oeis.a048;

/**
 * A048132 Becomes prime or 4 after exactly 10 iterations of f(x) = sum of prime factors of x.
 * @author Sean A. Irvine
 */
public class A048132 extends A048124 {

  @Override
  protected int iterations() {
    return 10;
  }
}
