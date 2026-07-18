package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a049.A049084;

/**
 * A085985 a(n) = A049084(A085818(n)).
 * @author Sean A. Irvine
 */
public class A085985 extends A085818 {

  private final DirectSequence mA = DirectSequence.create(new A049084());

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}
