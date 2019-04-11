package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000522;

/**
 * A001338 <code>-1 +</code> Sum <code>(k-1)!</code> C(n,k), <code>k = 1..n</code> for <code>n &gt; 0, a(0) = 1</code>.
 * @author Sean A. Irvine
 */
public class A001338 extends PartialSumSequence {

  private boolean mFirst = true;

  /** Constructor. */
  public A001338() {
    super(new A000522());
    mSum = Z.NEG_ONE;
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next();
  }
}
