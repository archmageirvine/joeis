package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A004441 Numbers that are not the sum of 4 distinct nonzero squares.
 * @author Sean A. Irvine
 */
public class A004441 extends ComplementSequence {

  /** Construct the sequence. */
  public A004441() {
    super(new A004433(), Z.ONE);
  }
}
