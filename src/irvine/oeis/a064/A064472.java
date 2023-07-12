package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A064472 Where the even terms appear in A064413 (if it begins with 2).
 * @author Sean A. Irvine
 */
public class A064472 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A064472() {
    super(1, 0, new A064413(), Z::isEven);
  }
}
