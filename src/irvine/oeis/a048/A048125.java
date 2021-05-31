package irvine.oeis.a048;

/**
 * A048125 Becomes prime or 4 after exactly 3 iterations of f(x) = sum of prime factors of x.
 * @author Sean A. Irvine
 */
public class A048125 extends A048124 {

  @Override
  protected int iterations() {
    return 3;
  }
}
