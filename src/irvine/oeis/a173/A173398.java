package irvine.oeis.a173;
// manually trisum/trisum2 at 2023-06-07 12:39

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007318;
import irvine.oeis.a112.A112468;
import irvine.oeis.triangle.Transpose;

/**
 * A173398 (A007318 + A112468)/2
 * @author Georg Fischer
 */
public class A173398 extends AbstractSequence {

  private final A007318 mSeq1 = new A007318();
  private final AbstractSequence mSeq2 = new Transpose(new A112468());

  /** Construct the sequence. */
  public A173398() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next()).divide2();
  }
}
