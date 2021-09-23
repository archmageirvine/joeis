package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A051611 Numbers that are not the sum of 2 nonzero triangular numbers.
 * @author Sean A. Irvine
 */
public class A051611 extends ComplementSequence {

  /** Construct the sequence. */
  public A051611() {
    super(new A051533(), Z.ONE);
  }
}
