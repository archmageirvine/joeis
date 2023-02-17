package irvine.oeis.a360;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a068.A068869;

/**
 * A360210 allocated for Alexander R. Povolotsky.
 * @author Sean A. Irvine
 */
public class A360210 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A360210() {
    super(1, new A068869(), Z::isSquare);
  }
}

