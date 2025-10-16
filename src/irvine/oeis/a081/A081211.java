package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A081210 In prime factorization of n replace each prime power p^e with the greatest squarefree number &lt;= p^e.
 * @author Sean A. Irvine
 */
public class A081211 extends Sequence1 {

  private final DirectSequence mA = new A081210();
  private long mN = 0;

  @Override
  public Z next() {
    return mA.a(mA.a(Z.valueOf(++mN)));
  }
}
