package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A072022.
 * @author Sean A. Irvine
 */
public class A076372 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A076372() {
    super(1, 1, new A076371(), Z.ONE::equals);
  }
}
