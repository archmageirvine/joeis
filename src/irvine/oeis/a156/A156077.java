package irvine.oeis.a156;

import irvine.math.z.Z;
import irvine.oeis.a054.A054353;

/**
 * A156077 a(n) = #{1&lt;=k&lt;=n : A000002(k)=1}.
 * @author Georg Fischer
 */
public class A156077 extends A054353 {

  private long mN = 0;

  @Override
  public Z next() {
    // a(n) = 2*n - A054353(n)
    ++mN;
    return super.next().negate().add(2 * mN);
  }
}
