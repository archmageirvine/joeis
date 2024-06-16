package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000276 Associated Stirling numbers.
 * @author Sean A. Irvine
 */
public class A000276 extends AbstractSequence {

  /** Construct the sequence. */
  public A000276() {
    super(4);
  }

  private int mN = 3;

  @Override
  public Z next() {
    return Functions.ASSOCIATED_STIRLING1.z(++mN, 2);
  }
}
