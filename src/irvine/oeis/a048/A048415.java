package irvine.oeis.a048;

/**
 * A048415 Primes whose consecutive digits differ by 3 or 4.
 * @author Sean A. Irvine
 */
public class A048415 extends A048413 {

  @Override
  protected long diff() {
    return 4;
  }
}
