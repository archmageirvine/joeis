package irvine.oeis.a281;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003188;
import irvine.oeis.a049.A049502;

/**
 * A281497 Write n in binary reflected Gray code and sum the positions where there is a '1' followed immediately to the left by a '0', counting the rightmost digit as position 1.
 * Formula: <code>a(n) = A049502(A003188(n)).</code>
 * @author Georg Fischer
 */
public class A281497 extends AbstractSequence {

  private final DirectSequence mSeq1 = new A049502();
  private final Sequence mSeq2 = new A003188().skip(1);

  /** Construct the sequence. */
  public A281497() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.a(mSeq2.next());
  }
}
