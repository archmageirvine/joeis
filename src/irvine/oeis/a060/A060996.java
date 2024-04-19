package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000110;

/**
 * A060996 Stirling2 transform of [2,3,3,3,3,3,3,3,...].
 * @author Georg Fischer
 */
public class A060996 extends Sequence0 {

  private final A000110 mSeq1 = new A000110();

  /** Construct the sequence. */
  public A060996() {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(3).subtract(1);
  }
}
