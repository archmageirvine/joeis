package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A049447 Stirling numbers of second kind: 9th column of Stirling2 triangle A008277.
 * @author Sean A. Irvine
 */
public class A049447 extends AbstractSequence {

  /** Construct the sequence. */
  public A049447() {
    super(9);
  }

  private long mN = 8;

  @Override
  public Z next() {
    return Functions.STIRLING2.z(++mN, 9);
  }
}
