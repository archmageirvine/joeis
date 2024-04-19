package irvine.oeis.a092;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a014.A014081;
import irvine.oeis.a056.A056973;

/**
 * A092339 Number of adjacent identical digits in the binary representation of n.
 * @author Georg Fischer
 */
public class A092339 extends AbstractSequence {

  private int mN = -1;
  private final A014081 mSeq1 = new A014081();
  private final A056973 mSeq2 = new A056973();

  /** Construct the sequence. */
  public A092339() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().add((++mN == 0) ? Z.ZERO : mSeq2.next());
  }
}
