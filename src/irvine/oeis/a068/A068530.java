package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a059.A059198;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A068530 n* values for self-contained numbers.
 * @author Sean A. Irvine
 */
public class A068530 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A068530() {
    super(1, new A059198(), Z::makeOdd);
  }
}
