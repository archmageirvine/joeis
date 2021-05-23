package irvine.oeis.a047;

/**
 * A047823 Becomes prime after exactly 4 iterations of f(x) = sum of prime factors of x.
 * @author Sean A. Irvine
 */
public class A047823 extends A047820 {

  @Override
  protected int iterations() {
    return 4;
  }
}
