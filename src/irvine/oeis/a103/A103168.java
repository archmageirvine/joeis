package irvine.oeis.a103;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A103168 a(n) is the remainder when (n written backwards) is divided by n.
 * @author Georg Fischer
 */
public class A103168 implements Sequence {

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
