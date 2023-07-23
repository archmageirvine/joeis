package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a141.A141468;

/**
 * A051350 Sum of digit-sums of first n nonprimes.
 * @author Sean A. Irvine
 */
public class A051350 extends AbstractSequence {

  private final A141468 mSeq1 = new A141468();

  /** Construct the sequence. */
  public A051350() {
    super(0);
  }

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.add(ZUtils.digitSum(mSeq1.next()));
    return mA;
  }
}
