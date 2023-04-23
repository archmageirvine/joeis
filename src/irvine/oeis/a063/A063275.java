package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A063275 Numbers that require three powerful numbers (definition 1) to sum to them.
 * @author Sean A. Irvine
 */
public class A063275 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A063275() {
    super(1, new A063274(), Z.THREE::equals);
  }
}
