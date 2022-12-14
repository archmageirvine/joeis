package irvine.oeis.a127;
// manually anopsn 0, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000271;

/**
 * A127548 O.g.f.: Sum_{n&gt;=0} n!*(x/(1+x)^2)^n.
 * @author Georg Fischer
 */
public class A127548 extends AbstractSequence {

  private final A000271 mSeq1 = new A000271();
  private Z mA;
  private int mN = -1;

  /** Construct the sequence. */
  public A127548() {
    super(0);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 0) {
      return Z.ONE;
    }
    final Z b = mSeq1.next();
    final Z result = b.add(mA);
    mA = b;
    return result;
  }
}
