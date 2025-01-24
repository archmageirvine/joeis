package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000244;
import irvine.oeis.a006.A006577;

/**
 * A074472 Length of iteration sequence of Collatz-function (A006370) when initial value is 3^n (A000244) and final cycle is followed once.
 * @author Sean A. Irvine
 */
public class A074472 extends A000244 {

  private final DirectSequence mCollatz = new A006577();

  @Override
  public Z next() {
    return mCollatz.a(super.next()).add(1);
  }
}

