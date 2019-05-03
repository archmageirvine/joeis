package irvine.oeis.a090;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Dutch;

/**
 * A090589 Number of letters in <code>n</code> (in Dutch).
 * @author Sean A. Irvine
 */
public class A090589 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Dutch.toDutch(++mN).replace(" ", "").length());
  }
}
