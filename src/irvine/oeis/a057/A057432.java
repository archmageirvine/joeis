package irvine.oeis.a057;

import irvine.oeis.InterleaveSequence;
import irvine.oeis.a007.A007305;
import irvine.oeis.a007.A007306;

/**
 * A057432 Obtained by reading first the numerator then the denominator of fractions in left-hand half of Stern-Brocot tree (A007305/A007306).
 * @author Sean A. Irvine
 */
public class A057432 extends InterleaveSequence {

  /** Construct the sequence. */
  public A057432() {
    super(0, new A007305(), new A007306());
    next();
    next();
  }
}
