package irvine.oeis.a319;

import irvine.math.z.Z;
import irvine.oeis.a073.A073138;

/**
 * A319650 a(n) = A073138(n) - n.
 * @author Georg Fischer
 */
public class A319650 extends A073138 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.next().subtract(mN);
  }
}
