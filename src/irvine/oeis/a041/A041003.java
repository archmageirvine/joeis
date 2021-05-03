package irvine.oeis.a041;
// manually

import irvine.math.z.Z;
import irvine.oeis.EulerTransform;
import irvine.oeis.SkipSequence;

/**
 * A041003 The sequence e, given that c is a left shift by one place of b.
 * @author Georg Fischer
 */
public class A041003 extends EulerTransform {

  private int mIndex; // local, different from super.mN
  
  /** Construct the sequence. */
  public A041003() {
    super(new SkipSequence(new A041004(), 1));
    mIndex = 0;
  }

  @Override
  public Z next() {
    Z result = Z.ONE;
    if (mIndex == 0) {
      ++mIndex;
    } else {
      result = super.next();
    } 
    return result;
  }
}
