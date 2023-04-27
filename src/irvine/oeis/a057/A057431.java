package irvine.oeis.a057;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007305;
import irvine.oeis.a047.A047679;

/**
 * A057431 Obtained by reading first the numerator then the denominator of fractions in full Stern-Brocot tree (A007305/A047679).
 * @author Sean A. Irvine
 */
public class A057431 extends AlternatingSequence {

  /** Construct the sequence. */
  public A057431() {
    super(0, new A007305(), new PrependSequence(new A047679(), 1, 0));
  }
}
