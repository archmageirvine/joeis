package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005685 Number of Twopins positions.
 * @author Sean A. Irvine
 */
public class A005685 extends AbstractSequence {

  /** Construct the sequence. */
  public A005685() {
    super(4);
  }

  private static final long[] C = {0, 1, 1, 0, -1, -1};
  private int mN = 3;

  @Override
  public Z next() {
    ++mN;
    return Functions.FIBONACCI.z((mN + 1) / 2).multiply2().add(Functions.FIBONACCI.z(mN)).add(C[mN % 6]).divide(4);
  }
}

