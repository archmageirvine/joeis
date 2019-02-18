package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;

/**
 * A018885.
 * @author Sean A. Irvine
 */
public class A018885 extends PrependSequence {

  /** Construct the sequence. */
  public A018885() {
    super(new A018884() {
      @Override
      protected boolean accept(final Z n) {
        return true;
      }
    }, Z.ZERO);
  }
}
