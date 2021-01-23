package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.ConvolutionSequence;

/**
 * A000499 a(n) = Sum_{k=1..n-1} k^3*sigma(k)*sigma(n-k).
 * @author Sean A. Irvine
 */
public class A000499 extends ConvolutionSequence {
  
  private boolean mFirst = true;

  private static class MySequence extends A000203 {
    @Override
    public Z next() {
      return super.next().multiply(mN).multiply(mN).multiply(mN);
    }
  }

  /** Default constructor. */
  public A000499() {
    super(new MySequence(), new A000203());
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
