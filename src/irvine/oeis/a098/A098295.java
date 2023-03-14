package irvine.oeis.a098;
// manually knestm/knest at 2023-03-12

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A098295 ((3/2)^n)/2^a(n) lies in the half-open interval [1,2).
 * @author Georg Fischer
 */
public class A098295 extends Sequence1 {

  private final A098294 mSeq = new A098294();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().subtract(1);
  }
}
