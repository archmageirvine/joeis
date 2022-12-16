package irvine.oeis.a248;
// manually anopsn 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a027.A027306;

/**
 * A248574 a(n) = A027306(n) + A027306(n-1) for n &gt; 0; a(0) = 1.
 * @author Georg Fischer
 */
public class A248574 extends AbstractSequence {

  private A027306 mSeq1 = new A027306();
  private Z mA;

  /** Construct the sequence. */
  public A248574() {
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
