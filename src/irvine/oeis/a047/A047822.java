package irvine.oeis.a047;

/**
 * A047822 Becomes prime after exactly 3 iterations of f(x) = sum of prime factors of x.
 * @author Sean A. Irvine
 */
public class A047822 extends A047820 {

  @Override
  protected int iterations() {
    return 3;
  }
}
