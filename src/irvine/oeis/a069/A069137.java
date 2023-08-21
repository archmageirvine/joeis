package irvine.oeis.a069;
// manually robots/union2 at 2023-08-18 21:53

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a000.A000578;
import irvine.oeis.a003.A003072;
import irvine.oeis.a003.A003325;
import irvine.oeis.a003.A003327;
import irvine.oeis.a003.A003328;
import irvine.oeis.a003.A003329;

/**
 * A069137 Numbers which are sums of neither 1, 2, 3, 4, 5 or 6 nonnegative cubes.
 * @author Georg Fischer
 */
public class A069137 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A069137() {
    super(1, new A000027(), new UnionSequence(new A003325(), new A003072(), new A003327(), new A003328(), new A003329(), new A000578()));
  }
}
