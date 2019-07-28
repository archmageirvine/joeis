package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024570 <code>a(n) =</code> sum of <code>[ 1/{k*r} ]</code> for k <code>= 1,2,...,n</code>, where r <code>= (1 + sqrt(5))/2</code> and <code>{x} := x - [ x ]</code>.
 * @author Sean A. Irvine
 */
public class A024570 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024570() {
    super(new A024569());
  }
}
