package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a005.A005250;
import irvine.oeis.a005.A005408;

/**
 * A063096 Non-record differences among consecutive primes.
 * @author Sean A. Irvine
 */
public class A063096 extends ComplementSequence {

  /** Construct the sequence. */
  public A063096() {
    super(new UnionSequence(new A005250(), new A005408()), Z.TEN);
  }
}
