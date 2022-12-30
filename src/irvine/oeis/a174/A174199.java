package irvine.oeis.a174;
// manually bisect at 2022-12-24 11:49

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a137.A137921;

/**
 * A174199 Bisection of A137921.
 * @author Georg Fischer
 */
public class A174199 extends Sequence1 {

  private final A137921 mSeq = new A137921();

  @Override
  public Z next() {
    mSeq.next();
    return mSeq.next();
  }
}
