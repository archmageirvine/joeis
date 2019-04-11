package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006411 Nonseparable planar tree-rooted maps with three vertices and <code>n+2</code> edges.
 * @author Sean A. Irvine
 */
public class A006411 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(mN + 1).multiply(mN + 2).multiply(mN + 2).multiply(mN + 3).divide(24);
  }
}
