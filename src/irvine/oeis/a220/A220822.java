package irvine.oeis.a220;
// Generated by gen_seq4.pl build/trionk

import irvine.math.z.Z;
import irvine.oeis.a319.A319541;

/**
 * A220822 Number of rooted binary leaf-multilabeled trees with n leaves on the label set [5].
 * @author Georg Fischer
 */
public class A220822 extends A319541 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.compute(mN, 4);
  }
}

