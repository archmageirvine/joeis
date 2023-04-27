package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A066279 a(n) = n^n + n + 1.
 * @author Georg Fischer
 */
public class A066279 extends AbstractSequence {

  private long mN = -2;

  /** Construct the sequence. */
  public A066279() {
    super(-1);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == -1) ? Z.NEG_ONE : Z.valueOf(mN).pow(mN).add(mN + 1);
  }
}
