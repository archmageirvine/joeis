package irvine.oeis.a209;
// manually knest at 2023-03-13

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006068;

/**
 * A209281 Start with first run [0,1] then, for n &gt;= 2, the n-th run has length 2^n and is the concatenation of [a(1),a(2),...,a(2^n/2)] and [n-a(1),n-a(2),...,n-a(2^n/2)].
 * @author Georg Fischer
 */
public class A209281 extends Sequence1 {

  private final A006068 mSeq = new A006068();

  @Override
  public Z next() {
    return Z.valueOf(mSeq.next().bitCount());
  }
}
