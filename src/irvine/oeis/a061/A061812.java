package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a022.A022844;

/**
 * A061812 Numbers k such that floor(Pi*k) is a square.
 * @author Sean A. Irvine
 */
public class A061812 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A061812() {
    super(0, 0, new A022844(), Z::isSquare);
  }
}

