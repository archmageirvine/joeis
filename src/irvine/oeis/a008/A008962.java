package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Polish;

/**
 * A008962.
 * @author Sean A. Irvine
 */
public class A008962 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Polish.toPolish(++mN).replace(" ", "").length());
  }
}

