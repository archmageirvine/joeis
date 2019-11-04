package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022847 Integer nearest <code>n*sqrt(3)</code>.
 * @author Sean A. Irvine
 */
public class A022847 implements Sequence {

  private static final CR N = CR.THREE.sqrt();
  private long mN = -1;

  @Override
  public Z next() {
    return N.multiply(++mN).round();
  }
}
