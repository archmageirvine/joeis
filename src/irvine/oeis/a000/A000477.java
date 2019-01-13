package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.ConvolutionSequence;

/**
 * A000477.
 * @author Sean A. Irvine
 */
public class A000477 extends ConvolutionSequence {
  
  private boolean mFirst = true;

  private static class MySequence extends A000203 {
    @Override
    public Z next() {
      return super.next().multiply(mN).multiply(mN);
    }
  }

  /** Default constructor. */
  public A000477() {
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
