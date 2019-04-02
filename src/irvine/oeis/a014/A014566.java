package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014566 Sierpi&#324;ski numbers of the first kind: n^n + 1.
 * @author Sean A. Irvine
 */
public class A014566 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN).add(1);
  }
}
