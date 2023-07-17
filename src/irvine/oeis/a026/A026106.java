package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002212;
import irvine.oeis.a007.A007317;

/**
 * A026106 Number of polyhexes of class PF2 (with one catafusene annealated to pyrene).
 * @author Sean A. Irvine
 */
public class A026106 extends A002212 {

  /** Construct the sequence. */
  public A026106() {
    super(5);
  }

  private final Sequence mB = new A007317();
  private Z mA = null;
  private boolean mEven = false;

  {
    super.next();
  }

  @Override
  public Z next() {
    mEven = !mEven;
    if (mEven) {
      mA = mB.next();
    }
    return super.next().multiply(3).add(mA).divide2();
  }
}
