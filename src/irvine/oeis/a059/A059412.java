package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a027.A027375;

/**
 * A059412 Number of distinct minimal unary DFA's with exactly n states.
 * @author Sean A. Irvine
 */
public class A059412 extends A059413 {

  private boolean mFirst = true;
  private final Sequence mSeq = new A027375();

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      mSeq.next();
      return mSeq.next();
    }
    return super.next().add(mSeq.next());
  }
}
