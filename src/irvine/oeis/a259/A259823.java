package irvine.oeis.a259;
// manually partsumm/partsum at 2022-03-24 22:32

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a003.A003586;

/**
 * A259823 a(0)=0, a(1)=1, a(n)=min{3 a(k) + 2^(n-k)-1, k=0..(n-1)} for n&gt;=2.
 * @author Georg Fischer
 */
public class A259823 extends PrependSequence {

  /** Construct the sequence. */
  public A259823() {
    super(new PartialSumSequence(new A003586()), 0);
  }
}
