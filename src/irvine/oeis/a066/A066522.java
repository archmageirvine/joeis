package irvine.oeis.a066;

import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a100.A100484;

/**
 * A066522 Numbers n whose divisors less than or equal to sqrt(n) are consecutive, from 1 up to some number k.
 * @author Sean A. Irvine
 */
public class A066522 extends UnionSequence {

  /** Construct the sequence. */
  public A066522() {
    super(1, new FiniteSequence(1, 8, 12, 18, 24, 60), new A000040(), new A100484());
  }
}
