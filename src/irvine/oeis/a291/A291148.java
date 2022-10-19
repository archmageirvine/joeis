package irvine.oeis.a291;

import irvine.math.z.Z;
import irvine.oeis.a005.A005169;
import irvine.oeis.transform.InverseInvertTransform;

/**
 * A291148 Expansion of 1 - x/(1 - x^2/(1 - x^3/(1 - x^4/(1 - x^5/(1 - x^6/(1 - ... - x^n/(1 - ...))))))), a continued fraction.
 * @author Georg Fischer
 */
public class A291148 extends InverseInvertTransform {

  private int mN = -1;

  /** Construct the sequence. */
  public A291148() {
    super(0, new A005169(), 1);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    return super.next().negate();
  }
}
