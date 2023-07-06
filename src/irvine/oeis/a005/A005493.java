package irvine.oeis.a005;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a000.A000110;

/**
 * A005493 2-Bell numbers: a(n) = number of partitions of [n+1] with a distinguished block.
 * @author Sean A. Irvine
 */
public class A005493 extends DifferenceSequence {

  /** Construct the sequence. */
  public A005493() {
    super(new A000110().skip(1));
  }
}

