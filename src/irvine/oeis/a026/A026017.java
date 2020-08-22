package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a003.A003517;

/**
 * A026017 a(n) = number of (s(0), s(1), ..., s(2n-1)) such that s(i) is a nonnegative integer and |s(i) - s(i-1)| = 1 for i = 1,2,...,n, s(0) = 2, s(2n-1) = 5. Also a(n) = T(2n-1,n-2), where T is the array defined in A026009.
 * @author Sean A. Irvine
 */
public class A026017 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026017() {
    super(new PrependSequence(new A003517(), 0));
  }
}

