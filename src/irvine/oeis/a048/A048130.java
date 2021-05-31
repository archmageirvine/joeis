package irvine.oeis.a048;

/**
 * A048130 Becomes prime or 4 after exactly 8 iterations of f(x) = sum of prime factors of x.
 * @author Sean A. Irvine
 */
public class A048130 extends A048124 {

  @Override
  protected int iterations() {
    return 8;
  }
}
