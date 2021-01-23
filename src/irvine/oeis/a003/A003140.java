package irvine.oeis.a003;

/**
 * A003140 Number of coprime chains with largest member prime(n).
 * @author Sean A. Irvine
 */
public class A003140 extends A003139 {

  @Override
  protected int nextLength(final int n) {
    return (int) mPrime.nextPrime(n);
  }

}
