package irvine.oeis.a103;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A103168 a(n) is the remainder when (n written backwards) is divided by n.
 * @author Georg Fischer
 */
public class A103168 extends Sequence1 {

  private int mN;

  /** Construct the sequence. */
  public A103168() {
    mN = 0;
  }

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return ZUtils.reverse(n).remainder(n);
  }
}
