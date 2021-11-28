package irvine.oeis.a219;
// manually quots at 2021-11-26 09:21

import irvine.math.z.Z;
import irvine.oeis.SelfQuotientSequence;
import irvine.oeis.a218.A218075;

/**
 * A219194 a(n) =  A218075(n+1)/A218075(n).
 * @author Georg Fischer
 */
public class A219194 extends SelfQuotientSequence {

  /** Construct the sequence. */
  public A219194() {
    super(new A218075());
  }

  @Override
  public Z next() {
    final Z t = mPrev;
    mPrev = mSeq.next();
    return t.compareTo(mPrev) < 0 ? mPrev.divide(t) : t.divide(mPrev);
  }
}
