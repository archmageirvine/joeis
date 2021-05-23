package irvine.oeis.a047;

/**
 * A047826 Becomes prime after exactly 7 iterations of f(x) = sum of prime factors of x.
 * @author Sean A. Irvine
 */
public class A047826 extends A047820 {

  @Override
  protected int iterations() {
    return 7;
  }
}
