package irvine.oeis.a086;
// manually floor at 2021-08-31 14:40

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A086863 a(n)=floor{square((1*n^0+1*n^1+2*n^2+4*n^3)/(1*n^0+2*n^1+1*n^2))}.
 * @author Georg Fischer
 */
public class A086863 extends FloorSequence {
  /** Construct the sequence */
  public A086863() {
    super(1);
  }

  protected Z evalCR(final long n) {
    final Z nz = Z.valueOf(n);
    final Z den2 = Z.valueOf(mN + 2).multiply(nz).add(Z.ONE).square();
    final Z num2 = Z.valueOf(4*mN + 2).multiply(nz).add(Z.ONE).multiply(nz).add(Z.ONE).square();
    return CR.valueOf(num2).divide(CR.valueOf(den2)).floor();
  }

}
