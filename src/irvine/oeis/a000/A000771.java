package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000771 Stirling numbers of second kind, S(n,7).
 * @author Sean A. Irvine
 */
public class A000771 extends AbstractSequence {

  /** Construct the sequence. */
  public A000771() {
    super(7);
  }

  private int mN = 6;

  @Override
  public Z next() {
    return Functions.STIRLING2.z(++mN, 7);
  }
}
