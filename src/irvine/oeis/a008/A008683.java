package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.math.Mobius;
import irvine.oeis.Sequence;

/**
 * A008683.
 * @author Sean A. Irvine
 */
public class A008683 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Mobius.mobius(++mN));
  }
}
