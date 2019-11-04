package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059543 Beatty sequence for <code>log(3)</code>.
 * @author Sean A. Irvine
 */
public class A059543 implements Sequence {

  private static final CR N = CR.THREE.log();
  private long mN = 0;

  @Override
  public Z next() {
    return N.multiply(++mN).floor();
  }
}
