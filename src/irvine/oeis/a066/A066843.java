package irvine.oeis.a066;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000005;

/**
 * A066843 a(n) = Product_{k=1..n} d(k); d(k) = A000005(k) is the number of positive divisors of k.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A066843 extends PartialProductSequence {

  /** Construct the sequence. */
  public A066843() {
    super(0, new PrependSequence(new A000005(), 1));
  }
}
