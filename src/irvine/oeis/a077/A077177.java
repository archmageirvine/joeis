package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a070.A070826;
import irvine.oeis.a078.A078926;

/**
 * A077177 Number of primitive Pythagorean triangles with perimeter equal to A002110(n), the product of the first n primes.
 * @author Sean A. Irvine
 */
public class A077177 extends A070826 {

  private final DirectSequence mSeq = new A078926();

  @Override
  public Z next() {
    return mSeq.a(super.next());
  }
}

