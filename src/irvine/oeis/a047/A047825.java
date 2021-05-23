package irvine.oeis.a047;

/**
 * A047825 Becomes prime after exactly 6 iterations of f(x) = sum of prime factors of x.
 * @author Sean A. Irvine
 */
public class A047825 extends A047820 {

  @Override
  protected int iterations() {
    return 6;
  }
}
