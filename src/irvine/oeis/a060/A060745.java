package irvine.oeis.a060;

import irvine.oeis.Combiner;
import irvine.oeis.RecordPositionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.a000.A000041;

/**
 * A060745 When gcd( p(n), q(n) ) increases, where p() is the unrestricted partition function (A000041) and q is the distinct partition function (A000009).
 * @author Sean A. Irvine
 */
public class A060745 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A060745() {
    super(new SkipSequence(new Combiner(0, new A000041(), new A000009(), Combiner.GCD), 1), 1);
  }
}
