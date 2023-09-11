package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A065751.
 * @author Sean A. Irvine
 */
public class A065752 extends FilterSequence {

  /** Construct the sequence. */
  public A065752() {
    super(0, new A065751(), Z::isSquare);
  }
}
