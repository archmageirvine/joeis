package irvine.oeis.a226;
// manually mult at 2022-08-01 10:35

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A226162 a(n) = Kronecker Symbol (-5/n), n &gt;= 0.
 * @author Georg Fischer
 */
public class A226162 implements SequenceWithOffset {

  private int mN = -1;

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.kronecker(-5, ++mN));
  }
}
