package irvine.oeis.a329;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000002;

/**
 * A329360 The decimal expansion of a(n) is the first n terms of A000002.
 * @author Georg Fischer
 */
public class A329360 extends Sequence0 {

  private final A000002 mSeq = new A000002();
  private final StringBuilder mTerm = new StringBuilder("0");

  @Override
  public Z next() {
    final Z result = new Z(mTerm.toString());
    mTerm.append(mSeq.next().toString());
    return result;
  }
}
