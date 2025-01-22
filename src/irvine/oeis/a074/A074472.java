package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000244;
import irvine.oeis.a006.A006577;

/**
 * A074663.
 * @author Sean A. Irvine
 */
public class A074472 extends A000244 {

  private final DirectSequence mCollatz = new A006577();

  @Override
  public Z next() {
    return mCollatz.a(super.next()).add(1);
  }
}

