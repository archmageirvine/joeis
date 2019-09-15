package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a003.A003517;

/**
 * A026017 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(2n-1))</code> such that <code>s(i)</code> is a nonnegative integer and <code>|s(i) - s(i-1)| = 1</code> for i <code>= 1,2,...,n, s(0) = 2, s(2n-1) = 5</code>. Also <code>a(n) = T(2n-1,n-2)</code>, where T is the array defined in <code>A026009</code>.
 * @author Sean A. Irvine
 */
public class A026017 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026017() {
    super(new PrependSequence(new A003517(), 0));
  }
}

