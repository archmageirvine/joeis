package irvine.oeis.a103;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A103166 a(n) = reverse(2^n) mod 2^n.
 * @author Georg Fischer
 */
public class A103166 implements Sequence {

  private int mN;

  /** Construct the sequence. */
  public A103166() {
    mN = 0;
  }

  @Override
  public Z next() {
    final Z n2 = Z.ONE.shiftLeft(++mN);
    return ZUtils.reverse(n2).mod(n2);
  }
}
