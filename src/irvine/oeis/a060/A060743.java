package irvine.oeis.a060;

import irvine.oeis.Combiner;
import irvine.oeis.InverseSequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.a000.A000041;

/**
 * A060743 Least k such that gcd( p(k), q(k) ) is n, where p() is the unrestricted partition function (A000041) and q is the distinct partition function (A000009).
 * @author Sean A. Irvine
 */
public class A060743 extends InverseSequence {

  /** Construct the sequence. */
  public A060743() {
    super(new Combiner(1, new A000041(), new A000009(), Combiner.GCD).skip(1), 1);
  }
}
