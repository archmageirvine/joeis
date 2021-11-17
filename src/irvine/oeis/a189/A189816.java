package irvine.oeis.a189;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A189816 a(3*k-2)=0, a(3*k-1)=1-a(k), a(3*k)=1-a(k); k&gt;0, a(1)=0.
 * @author Georg Fischer
 */
public class A189816 extends MemorySequence {

  protected int mN;

  /** Construct the sequence. */
  public A189816() {
    mN = -1;
    next(); // skip a(0)
  }

  @Override
  public Z computeNext() {
    ++mN;
    if (mN == 0 || mN % 3 == 1) {
      return Z.ZERO;
    } else {
      return Z.ONE.subtract(a((mN + 1) / 3));
    }
  }
}
