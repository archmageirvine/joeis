package irvine.oeis.a046;

/**
 * A046465 Numbers k such that the concatenation of numbers from 1 to k is the product of 6 primes (not necessarily distinct).
 * @author Sean A. Irvine
 */
public class A046465 extends A046462 {

  @Override
  protected long targetOmega() {
    return 6;
  }
}
