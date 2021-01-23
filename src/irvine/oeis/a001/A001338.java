package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000522;

/**
 * A001338 -1 + Sum (k-1)! C(n,k), k = 1..n for n &gt; 0, a(0) = 1.
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
