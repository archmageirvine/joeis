package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001221;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A062799 Inverse M\u00f6bius transform of the numbers of distinct prime factors (A001221).
 * @author Georg Fischer
 */
public class A062799 extends Sequence1 {

  private final int mN = 0;
  private final InverseMobiusTransformSequence mSeq = new InverseMobiusTransformSequence(new A001221(), 0);

  {
    next();
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
