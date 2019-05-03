package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.ConvolutionSequence;

/**
 * A006319 Royal paths in a lattice (convolution of <code>A006318)</code>.
 * @author Sean A. Irvine
 */
public class A006319 extends ConvolutionSequence {

  private boolean mFirst = true;

  /** Construct the sequence. */
  public A006319() {
    super(new A006318());
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

