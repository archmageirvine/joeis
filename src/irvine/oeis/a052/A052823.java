package irvine.oeis.a052;
// manually 2021-09-25

import irvine.math.z.Z;
import irvine.oeis.a000.A000031;

/**
 * A052823 A simple grammar: cycles of pairs of sequences. 
 * @author Georg Fischer
 */
public class A052823 extends A000031 {

  @Override
  public Z next() {
    return super.next().subtract(mN == 0 ? 1 : 2);
  }
}
