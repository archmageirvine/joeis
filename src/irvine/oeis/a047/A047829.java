package irvine.oeis.a047;

/**
 * A047829 Becomes prime after exactly 10 iterations of f(x) = sum of prime factors of x.
 * @author Sean A. Irvine
 */
public class A047829 extends A047820 {

  @Override
  protected int iterations() {
    return 10;
  }
}
