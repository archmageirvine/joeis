package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005614 The binary complement of the infinite Fibonacci word A003849. Start with 1, apply <code>0-&gt;1, 1-&gt;10</code>, iterate, take limit.
 * @author Sean A. Irvine
 */
public class A005614 implements Sequence {

  private StringBuilder mSeq = new StringBuilder("10");
  private int mPos = -1;
  private int mRepPos = 0;

  @Override
  public Z next() {
    if (++mPos >= mSeq.length()) {
      mSeq.append(mSeq.charAt(++mRepPos) == '0' ? "1" : "10");
    }
    return mSeq.charAt(mPos) == '0' ? Z.ZERO : Z.ONE;
  }
}

