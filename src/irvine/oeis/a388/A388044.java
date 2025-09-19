package irvine.oeis.a388;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a001.A001694;
import irvine.oeis.a010.A010846;

/**
 * A388044 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A388044 extends A001694 {

  final DirectSequence mA = new A010846();

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}

