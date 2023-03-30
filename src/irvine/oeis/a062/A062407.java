package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a024.A024916;

/**
 * A062407 Numbers of the form Sum_{j=1..k} sigma(j) that are square.
 * @author Sean A. Irvine
 */
public class A062407 extends FilterSequence {

  /** Construct the sequence. */
  public A062407() {
    super(new A024916(), Z::isSquare);
  }
}
