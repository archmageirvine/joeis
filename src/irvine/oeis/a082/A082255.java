package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082255 Integer part of (concatenation of (8n-3), (8n-2), (8n-1), (8n), (8n+1), (8n+2), (8n+3), (8n+4) divided by 8).
 * @author Georg Fischer
 */
public class A082255 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return new Z(String.valueOf(8 * mN - 3) + String.valueOf(8 * mN - 2) + String.valueOf(8 * mN - 1) + String.valueOf(8 * mN) + String.valueOf(8 * mN + 1) + String.valueOf(8 * mN + 2) + String.valueOf(8 * mN + 3) + String.valueOf(8 * mN + 4)).divide(8);
  }
}
