package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A064473 Where the odd terms appear in A064413 (if it begins at 2).
 * @author Sean A. Irvine
 */
public class A064473 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A064473() {
    super(1, 1, new A064413().skip(), Z::isOdd);
  }
}
