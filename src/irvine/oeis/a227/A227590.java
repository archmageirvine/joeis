package irvine.oeis.a227;
// manually knestm/knest at 2023-03-02 16:06

import irvine.math.z.Z;
import irvine.oeis.a003.A003022;

/**
 * A227590 a(n) = A003022(n)+1 with a(1)=1.
 * @author Georg Fischer
 */
public class A227590 extends A003022 {

  private int mN = 0;

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ONE : super.next().add(1);
  }
}
