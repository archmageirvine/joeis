package irvine.oeis.a249;
// manually 2026-11-22

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a003.A003961;

/**
 * A249734 Even bisection of A003961: Replace in 2n each prime factor p(k) with prime p(k+1).
 * @author Georg Fischer
 */
public class A249734 extends AbstractSequence implements DirectSequence {

  private final DirectSequence mSeq;

  /** Construct the sequence. */
  public A249734() {
    super(1);
    mSeq = new A003961();
  }

  @Override
  public Z next() {
    return Z.THREE.multiply(mSeq.next());
  }


  @Override
  public Z a(final Z n) {
    return mSeq.a(n.multiply2());
  }

  @Override
  public Z a(final long n) {
    return mSeq.a(2 * n);
  }

}
