package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a008.A008472;

/**
 * A024924 <code>a(n) =</code> sum of <code>prime(k)*floor(n/prime(k))</code> over k <code>= 1,2,3,...,n</code>.
 * @author Sean A. Irvine
 */
public class A024924 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024924() {
    super(new PrependSequence(new A008472(), 0));
  }
}
