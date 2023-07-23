package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005043;
import irvine.oeis.a005.A005213;

/**
 * A007122 Number of unlabeled identity connected unit interval graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A007122 extends AbstractSequence {

  private final A005043 mSeq1 = new A005043();

  /** Construct the sequence. */
  public A007122() {
    super(1);
  }

  private final A005213 mA = new A005213();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return mSeq1.next().subtract(mA.next()).divide2();
  }
}
