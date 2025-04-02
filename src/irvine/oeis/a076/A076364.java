package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a061.A061498;

/**
 * A076340.
 * @author Sean A. Irvine
 */
public class A076364 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A076364() {
    super(1, new A061498(), Z.TWO::equals);
  }
}
