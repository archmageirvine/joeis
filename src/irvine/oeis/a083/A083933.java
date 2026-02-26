package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a007.A007088;

/**
 * A083933 A063171-encoding of A083923-trees.
 * @author Sean A. Irvine
 */
public class A083933 extends A083932 {

  private final DirectSequence mA = new A007088();

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}
