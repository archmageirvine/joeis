package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A049434 Stirling numbers of second kind: 8th column of Stirling2 triangle A008277.
 * @author Sean A. Irvine
 */
public class A049434 extends AbstractSequence {

  /** Construct the sequence. */
  public A049434() {
    super(8);
  }

  private long mN = 7;

  @Override
  public Z next() {
    return Functions.STIRLING2.z(++mN, 8);
  }
}
