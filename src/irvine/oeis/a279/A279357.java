package irvine.oeis.a279;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005187;

/**
 * A279357 a(n) = A005187(n) XOR A005187(n+1).
 * @author Georg Fischer
 */
public class A279357 extends AbstractSequence {

  private final A005187 mSeq1 = new A005187();
  private Z mA;

  /** Construct the sequence. */
  public A279357() {
    super(0);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    final Z b = mSeq1.next();
    final Z result = mA.xor(b);
    mA = b;
    return result;
  }
}
