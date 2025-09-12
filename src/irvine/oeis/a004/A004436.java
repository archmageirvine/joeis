package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a001.A001974;

/**
 * A004436 Numbers that are not the sum of 3 distinct squares.
 * @author Sean A. Irvine
 */
public class A004436 extends ComplementSequence {

  /** Construct the sequence. */
  public A004436() {
    super(Z.ONE, new A001974());
  }
}
