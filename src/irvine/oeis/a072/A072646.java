package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a048.A048680;

/**
 * A072646 Composition of the permutations A048680 &amp; A072636, i.e., a(n) = A048680(A072636(n)).
 * @author Sean A. Irvine
 */
public class A072646 extends A072636 {

  private final DirectSequence mA = new A048680();

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}
