package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a080.A080300;

/**
 * A083934 A014486-indices of A083932-trees.
 * @author Sean A. Irvine
 */
public class A083934 extends A083932 {

  private final DirectSequence mA = DirectSequence.create(new A080300());

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}
