package irvine.oeis.a309;
// manually anopsn 0, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000219;

/**
 * A309267 Expansion of (1 + x) * Product_{k&gt;=1} 1/(1 - x^k)^k.
 * @author Georg Fischer
 */
public class A309267 extends AbstractSequence {

  private A000219 mSeq1 = new A000219();
  private Z mA;

  /** Construct the sequence. */
  public A309267() {
    super(0);
    mA = Z.ZERO;
  }

  @Override
  public Z next() {
    final Z b = mSeq1.next();
    final Z result = b.add(mA);
    mA = b;
    return result;
  }
}
