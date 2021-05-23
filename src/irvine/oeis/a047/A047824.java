package irvine.oeis.a047;

/**
 * A047824 Becomes prime after exactly 5 iterations of f(x) = sum of prime factors of x.
 * @author Sean A. Irvine
 */
public class A047824 extends A047820 {

  @Override
  protected int iterations() {
    return 5;
  }
}
