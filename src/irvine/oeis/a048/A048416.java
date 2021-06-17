package irvine.oeis.a048;

/**
 * A048416 Primes whose consecutive digits differ by 4 or 5.
 * @author Sean A. Irvine
 */
public class A048416 extends A048413 {

  @Override
  protected long diff() {
    return 5;
  }
}
