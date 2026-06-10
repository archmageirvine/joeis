package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A085255 Numbers having at least two representations as a sum of two powerful numbers (A001694).
 * @author Sean A. Irvine
 */
public class A085255 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A085255() {
    super(1, new A085252(), k -> k.compareTo(Z.TWO) >= 0);
  }
}
