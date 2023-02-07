package irvine.oeis.a292;
// manually etman at 2023-02-06 12:43

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A292518 Expansion of Product_{k&gt;=1} (1 - x^(k*(k+1)/2)).
 * @author Georg Fischer
 */
public class A292518 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A292518() {
    super(0, 1);
    mNextH = advanceH(mKh);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[] {Z.NEG_ONE};
  }

  @Override
  protected Z advanceH(final long k) {
    return Z.valueOf(k * (k + 1) / 2);
  }

}
