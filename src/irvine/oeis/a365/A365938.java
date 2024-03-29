package irvine.oeis.a365;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;
import irvine.oeis.transform.GilbreathTransformSequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A365938 Form the "Gilbreath Transform" array for the Euler phi function (A000010); sequence gives the third column, divided by 2.
 * @author Sean A. Irvine
 */
public class A365938 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A365938() {
    super(1, new GilbreathTransformSequence(1, new A000010().skip(2)), Z::divide2);
  }
}
