package irvine.oeis.a048;

/**
 * A048414 Primes whose consecutive digits differ by 2 or 3.
 * @author Sean A. Irvine
 */
public class A048414 extends A048413 {

  @Override
  protected long diff() {
    return 3;
  }
}
