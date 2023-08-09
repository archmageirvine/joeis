package irvine.oeis.a140;
// manually triprod at 2023-08-09

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;
import irvine.oeis.a014.A014963;

/**
 * A140651 A140579^(-1) * A000290, the squares starting (1, 4, 9, ...).
 * @author Georg Fischer
 */
public class A140651 extends Sequence1 {

  private final AbstractSequence mSeq1 = new A000290().skip(1);
  private final A014963 mSeq2 = new A014963();

  @Override
  public Z next() {
    return mSeq1.next().divide(mSeq2.next());
  }
}
