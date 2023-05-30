package irvine.oeis.a120;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a038.A038207;

/**
 * A120910 Triangle read by rows: T(n,k) is the number of ternary words of length n having k levels (n &gt;= 1, 0 &lt;= k &lt;= n-1).
 * A level is a pair of identical consecutive letters.
 * @author Georg Fischer
 */
public class A120910 extends Sequence1 {

  private final A038207 mSeq = new A038207();

  @Override
  public Z next() {
    return mSeq.next().multiply(3);
  }
}
