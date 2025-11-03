package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A081503 Number of steps to reach a single digit when map in A081502 is iterated.
 * @author Sean A. Irvine
 */
public class A081503 extends Sequence0 {

  private final DirectSequence mA = DirectSequence.create(new A081502());
  private int mN = -1;

  @Override
  public Z next() {
    int cnt = 0;
    int t = ++mN;
    while (t > 9) {
      t = mA.a(t).intValueExact();
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
