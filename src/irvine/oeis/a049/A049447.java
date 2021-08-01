package irvine.oeis.a049;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049447 Stirling numbers of second kind: 9th column of Stirling2 triangle A008277.
 * @author Sean A. Irvine
 */
public class A049447 implements Sequence {

  private long mN = 8;

  @Override
  public Z next() {
    return Stirling.secondKind(++mN, 9);
  }
}
