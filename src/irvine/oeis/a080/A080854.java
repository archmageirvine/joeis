package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a117.A117929;

/**
 * A078299.
 * @author Sean A. Irvine
 */
public class A080854 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A080854() {
    super(1, new A117929(), Z.FIVE::equals);
  }
}

