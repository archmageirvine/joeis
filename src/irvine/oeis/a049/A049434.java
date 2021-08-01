package irvine.oeis.a049;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049434 Stirling numbers of second kind: 8th column of Stirling2 triangle A008277.
 * @author Sean A. Irvine
 */
public class A049434 implements Sequence {

  private long mN = 7;

  @Override
  public Z next() {
    return Stirling.secondKind(++mN, 8);
  }
}
