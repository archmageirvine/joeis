package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.InverseSequence;
import irvine.oeis.a002.A002321;

/**
 * A051401 Smallest value of x such that M(x) = -n, where M(x) is Mertens's function A002321.
 * @author Sean A. Irvine
 */
public class A051401 extends InverseSequence {

  /** Construct the sequence. */
  public A051401() {
    super(new A002321() {
      @Override
      public Z next() {
        return super.next().negate();
      }
    }, 1);
  }
}
