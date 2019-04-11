package irvine.oeis.a005;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000110;

/**
 * A005493 2-Bell numbers: <code>a(n) =</code> number of partitions of <code>[n+1]</code> with a distinguished block.
 * @author Sean A. Irvine
 */
public class A005493 extends DifferenceSequence {

  /** Construct the sequence. */
  public A005493() {
    super(new SkipSequence(new A000110(), 1));
  }
}

