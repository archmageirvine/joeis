package irvine.oeis.a047;

/**
 * A047828 Becomes prime after exactly 9 iterations of f(x) = sum of prime factors of x.
 * @author Sean A. Irvine
 */
public class A047828 extends A047820 {

  @Override
  protected int iterations() {
    return 9;
  }
}
