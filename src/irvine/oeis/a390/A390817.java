package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000668;
import irvine.oeis.a006.A006667;

/**
 * A390817 Number of tripling steps to reach 1 in the 3x+1 (Collatz) problem starting with the n-th Mersenne prime.
 * @author Sean A. Irvine
 */
public class A390817 extends A000668 {

  private final DirectSequence mCollatz = new A006667();

  @Override
  public Z next() {
    return mCollatz.a(super.next());
  }
}
