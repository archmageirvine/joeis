package irvine.oeis.a160;
// manually anopan 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a161.A161205;

/**
 * A160812 a(n) = A161205(n)-A000005(n).
 * @author Georg Fischer
 */
public class A160812 extends AbstractSequence {

  private final A161205 mSeq1 = new A161205();
  private final A000005 mSeq2 = new A000005();

  /** Construct the sequence. */
  public A160812() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
