package irvine.oeis.a038;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038126 a(n) = floor( sqrt(2*Pi)*n ) (a Beatty sequence).
 * @author Sean A. Irvine
 */
public class A038126 implements Sequence {

  private static final CR C = CR.TAU.sqrt();
  private long mN = -1;

  @Override
  public Z next() {
    return C.multiply(++mN).floor();
  }
}
