package irvine.oeis.a289;
// manually A289064/parm3 at 2021-12-05 12:16

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A289070 a(n) = c(2n-1), where c(n+2) = Sum_{k=0..n} binomial(n,k)c(k)c(n+1-k) with c(0)=0, c(1)=3.
 * @author Georg Fischer
 */
public class A289070 extends Sequence1 {

  private final A289064 mSeq = new A289064(0, 3, 0, 0);

  @Override
  public Z next() {
    mSeq.next();
    return mSeq.next();
  }
}
