package irvine.oeis.a131;
// manually trisum/trisum3 at 2023-06-07 08:41

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007318;
import irvine.oeis.a046.A046854;
import irvine.oeis.a065.A065941;

/**
 * A131402 2*A007318 - (A046854 + A065941 - A000012).
 * @author Georg Fischer
 */
public class A131402 extends AbstractSequence {

  private final A007318 mSeq1 = new A007318();
  private final A046854 mSeq2 = new A046854();
  private final A065941 mSeq3 = new A065941();

  /** Construct the sequence. */
  public A131402() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply2().subtract(mSeq2.next()).subtract(mSeq3.next()).add(1);
  }
}
