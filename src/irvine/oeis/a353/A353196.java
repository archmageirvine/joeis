package irvine.oeis.a353;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000079;
import irvine.oeis.a028.A028362;

/**
 * A353196 Number of stabilizer states on n qubits.
 * @author Georg Fischer
 */
public class A353196 extends Sequence1 {

  private final Sequence mSeq1 = new A000079().skip();
  private final Sequence mSeq2 = new A028362().skip(2);

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
