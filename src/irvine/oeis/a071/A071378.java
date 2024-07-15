package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a032.A032742;

/**
 * A071291.
 * @author Sean A. Irvine
 */
public class A071378 extends Sequence2 {

  private final DirectSequence mSeq = new A032742();
  private long mN = 1;

  @Override
  public Z next() {
    return mSeq.a(Z.valueOf(++mN).pow(3));
  }
}
