package irvine.oeis.a041;
// manually

import irvine.math.z.Z;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.SkipSequence;

/**
 * A041003 The sequence e, given that c is a left shift by one place of b.
 * @author Georg Fischer
 */
public class A041003 extends EulerTransform {

  private boolean mFirst = true;
  
  /** Construct the sequence. */
  public A041003() {
    super(new SkipSequence(new A041004(), 1));
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    } else {
      return super.next();
    } 
  }
}
