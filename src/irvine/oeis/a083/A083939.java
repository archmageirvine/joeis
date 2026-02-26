package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a014.A014486;

/**
 * A083939 A014486-encoding of binary trees whose left and right subtree are identical.
 * @author Sean A. Irvine
 */
public class A083939 extends A083938 {

  private final DirectSequence mA = DirectSequence.create(new A014486());

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}
