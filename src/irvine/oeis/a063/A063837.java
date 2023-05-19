package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a057.A057980;

/**
 * A063837 Numbers k&gt;3 such that the divisibility tournament on 2..k has an odd determinant.
 * @author Sean A. Irvine
 */
public class A063837 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A063837() {
    super(4, new A057980(), Z::isOdd);
  }
}
