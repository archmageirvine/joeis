package irvine.oeis.a246;
// Generated by gen_seq4.pl tricol/arrcol

import irvine.math.z.Z;
import irvine.oeis.a176.A176129;

/**
 * A246635 Number of solid standard Young tableaux of shape [[10*n,n],[n]].
 * @author Georg Fischer
 */
public class A246635 extends A176129 {

  private int mN = -1;

  @Override
  public Z next() {
    return super.matrixElement(++mN, 10);
  }
}

