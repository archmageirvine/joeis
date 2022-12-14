package irvine.oeis.a253;
// manually anopsn 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000796;

/**
 * A253828 Digit of Pi raised to the power of the next digit of Pi.
 * @author Georg Fischer
 */
public class A253828 extends AbstractSequence {

  private A000796 mSeq1 = new A000796();
  private Z mA;

  /** Construct the sequence. */
  public A253828() {
    super(1);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    final Z b = mSeq1.next();
    final Z result = mA.pow(b);
    mA = b;
    return result;
  }
}
