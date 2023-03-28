package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a051.A051801;

/**
 * A062365.
 * @author Sean A. Irvine
 */
public class A062371 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A062371() {
    super(0, 1, new SkipSequence(new A051801(), 1), Z::isSquare);
  }
}
