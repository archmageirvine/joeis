package irvine.oeis.a161;
// manually anopsn 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000196;

/**
 * A161205 Triangle read by rows in which row n lists 2n-1 followed by 2n numbers 2n.
 * @author Georg Fischer
 */
public class A161205 extends AbstractSequence {

  private final A000196 mSeq1 = new A000196();
  private Z mA;

  /** Construct the sequence. */
  public A161205() {
    super(1);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    final Z b = mSeq1.next();
    final Z result = b.add(mA);
    mA = b;
    return result;
  }
}
