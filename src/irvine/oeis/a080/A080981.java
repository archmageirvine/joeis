package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a014.A014486;

/**
 * A080910.
 * @author Sean A. Irvine
 */
public class A080981 extends A080980 {

  private final DirectSequence mA = DirectSequence.create(new A014486());

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}

