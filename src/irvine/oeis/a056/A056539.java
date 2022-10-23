package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.SkipSequence;
import irvine.oeis.a030.A030101;
import irvine.oeis.a036.A036044;

/**
 * A056539 Self-inverse permutation: reverse the bits in binary expansion of n and also complement them (0-&gt;1, 1-&gt;0) if the run count (A005811) is even.
 * @author Sean A. Irvine
 */
public class A056539 extends Sequence0 {

  private final Sequence mEven = new PrependSequence(new SkipSequence(new A036044(), 1), 0);
  private final Sequence mOdd = new A030101();
  private boolean mSide = false;

  @Override
  public Z next() {
    final Z e = mEven.next();
    final Z o = mOdd.next();
    mSide = !mSide;
    return mSide ? e : o;
  }
}
