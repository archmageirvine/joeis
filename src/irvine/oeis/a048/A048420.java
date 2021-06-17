package irvine.oeis.a048;

/**
 * A048420 Primes whose consecutive digits differ by 8 or 9.
 * @author Sean A. Irvine
 */
public class A048420 extends A048413 {

  @Override
  protected long diff() {
    return 9;
  }
}
