package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000554 Number of labeled trees of diameter 3 with n nodes.
 * @author Sean A. Irvine
 */
public class A000554 extends AbstractSequence {

  /** Construct the sequence. */
  public A000554() {
    super(4);
  }

  private int mN = 3;

  @Override
  public Z next() {
    ++mN;
    return Functions.STIRLING2.z(mN - 2, 2).multiply(mN).multiply(mN - 1);
  }
}
