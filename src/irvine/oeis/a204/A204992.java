package irvine.oeis.a204;

import irvine.math.z.Z;

/**
 * A204992 (1/n)*A204991(n).
 * @author Georg Fischer
 */
public class A204992 extends A204991 {

  private int mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
