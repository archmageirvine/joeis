package irvine.oeis.a068;
// manually knestm/knest at 2023-03-02 15:17

import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a060.A060072;

/**
 * A068792 a(n) = (n-1)*n^(n-2) + Sum_{i=1..n} (n-i)*(n^(n-i-1) + n^(n+i-3)).
 * @author Georg Fischer
 */
public class A068792 extends Sequence2 {

  private final A060072 mSeq = new A060072();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().square();
  }
}
