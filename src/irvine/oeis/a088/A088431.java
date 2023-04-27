package irvine.oeis.a088;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007400;

/**
 * A088431 Half of the (n+1)-st component of the continued fraction expansion of Sum_{k&gt;=1} 1/2^(2^k).
 * @author Georg Fischer
 */
public class A088431 extends Sequence1 {

  private final A007400 mSeq;

  /** Construct the sequence. */
  public A088431() {
    mSeq = new A007400();
    mSeq.next();
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().divide2();
  }
}
