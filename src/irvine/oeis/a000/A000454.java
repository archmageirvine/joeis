package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000454 Unsigned Stirling numbers of first kind s(n,4).
 * @author Sean A. Irvine
 */
public class A000454 extends AbstractSequence {

  /** Construct the sequence. */
  public A000454() {
    super(4);
  }

  private int mN = 3;

  @Override
  public Z next() {
    return Functions.STIRLING1.z(++mN, 4).abs();
  }
}
