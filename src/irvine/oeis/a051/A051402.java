package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.InverseSequence;
import irvine.oeis.a002.A002321;

/**
 * A051402 Inverse Mertens function: smallest k such that |M(k)| = n, where M(x) is Mertens's function A002321.
 * @author Sean A. Irvine
 */
public class A051402 extends InverseSequence {

  /** Construct the sequence. */
  public A051402() {
    super(new A002321() {
      @Override
      public Z next() {
        return super.next().abs();
      }
    }, 1);
  }
}
