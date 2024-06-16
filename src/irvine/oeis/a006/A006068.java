package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A006068 a(n) is Gray-coded into n.
 * @author Sean A. Irvine
 */
public class A006068 extends AbstractSequence implements DirectSequence {

  private long mN = -1;

  /** Construct the sequence. */
  public A006068() {
    super(0);
  }

  @Override
  public Z next() {
    return Functions.GRAY_DECODE.z(++mN);
  }

  @Override
  public Z a(final int n) {
    return Functions.GRAY_DECODE.z(n);
  }

  @Override
  public Z a(final Z n) {
    return Functions.GRAY_DECODE.z(n);
  }
}

