package irvine.oeis.a046;

/**
 * A046468 Numbers k such that the concatenation of numbers from 1 to k is the product of 9 primes (not necessarily distinct).
 * @author Sean A. Irvine
 */
public class A046468 extends A046462 {

  @Override
  protected long targetOmega() {
    return 9;
  }
}
