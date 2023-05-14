package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a051.A051953;

/**
 * A063752 Numbers k such that cototient(k) is a square.
 * @author Sean A. Irvine
 */
public class A063752 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A063752() {
    super(1, 1, new A051953(), Z::isSquare);
  }
}
