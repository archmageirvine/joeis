package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Russian;

/**
 * A006994.
 * @author Sean A. Irvine
 */
public class A006994 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Russian.toRussian(++mN).replace(" ", "").length());
  }
}
