package irvine.oeis.a288;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000521;

/**
 * A288837 Coefficients in expansion of 691*E_12/Delta where Delta is the generating function of Ramanujan's tau function (A000594).
 * a(n) = 691*A000521(n) = 691*A289063(n+1) for n &gt; 0.
 * @author Georg Fischer
 */
public class A288837 extends AbstractSequence {

  private final A000521 mSeq;
  private int mN = -2;

  /** Construct the sequence. */
  public A288837() {
    super(-1);
    mSeq = new A000521();
  }

  @Override
  public Z next() {
    final Z result = mSeq.next();
    return (++mN == 0) ? Z.valueOf(82104) : result.multiply(691);
  }
}
