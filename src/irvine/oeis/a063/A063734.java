package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005101;

/**
 * A063734 Square abundant numbers.
 * @author Sean A. Irvine
 */
public class A063734 extends FilterSequence {

  /** Construct the sequence. */
  public A063734() {
    super(new A005101(), Z::isSquare);
  }
}
