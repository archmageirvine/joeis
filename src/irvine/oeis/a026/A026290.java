package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A026290 a(n) = number of (s(0), s(1), ..., s(n)) such that every s(i) is an integer, s(0) = 0, s(1) = 1, s(n) = 4, |s(i) - s(i-1)| &lt;= 1 for i &gt;=2, |s(2) - s(1)| = 1, |s(3) - s(2)| = 1 if s(2) = 1. Also a(n) = T(n,n-4), where T is the array in A026268.
 * @author Sean A. Irvine
 */
public class A026290 extends AbstractSequence {

  private Z mA = Z.ZERO;
  private final A026125 mSeq = new A026125();

  /** Construct the sequence. */
  public A026290() {
    super(4);
  }

  @Override
  public Z next() {
    final Z t = mA;
    mA = mSeq.next();
    return mA.add(t);
  }
}
