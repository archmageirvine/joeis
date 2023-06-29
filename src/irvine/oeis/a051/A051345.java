package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007534;

/**
 * A051345 Odd numbers not of the form 3 + twin prime + twin prime.
 * @author Sean A. Irvine
 */
public class A051345 extends PrependSequence {

  /** Construct the sequence. */
  public A051345() {
    super(1, new A007534() {
      @Override
      public Z next() {
        return super.next().add(3);
      }
    }, 1, 3);
  }
}
