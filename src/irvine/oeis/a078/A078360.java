package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A078360 Numbers having a unique representation as sum of a positive square and a positive cube.
 * @author Sean A. Irvine
 */
public class A078360 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A078360() {
    super(1, new A078359(), Z::isOne);
  }
}

