package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A074644 a(n) = (A074639(n^2) - A074639(n)) mod n.
 * @author Sean A. Irvine
 */
public class A074644 extends Sequence1 {

  private final DirectSequence mSeq = new A074639();
  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return mSeq.a(n.square()).subtract(mSeq.a(n)).mod(n);
  }
}
