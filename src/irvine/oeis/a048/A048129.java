package irvine.oeis.a048;

/**
 * A048129 Becomes prime or 4 after exactly 7 iterations of f(x) = sum of prime factors of x.
 * @author Sean A. Irvine
 */
public class A048129 extends A048124 {

  @Override
  protected int iterations() {
    return 7;
  }
}
