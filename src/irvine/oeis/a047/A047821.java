package irvine.oeis.a047;

/**
 * A047821 Becomes prime after exactly 2 iterations of f(x) = sum of prime factors of x.
 * @author Sean A. Irvine
 */
public class A047821 extends A047820 {

  @Override
  protected int iterations() {
    return 2;
  }
}
