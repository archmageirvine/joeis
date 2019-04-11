package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a064.A064987;

/**
 * A000441 <code>a(n) =</code> Sum_{k=1..n-1} k*sigma(k)*sigma(n-k).
 * @author Sean A. Irvine
 */
public class A000441 extends ConvolutionSequence {
  
  private boolean mFirst = true;

  /** Default constructor. */
  public A000441() {
    super(new A064987(), new A000203());
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next();
  }
}
