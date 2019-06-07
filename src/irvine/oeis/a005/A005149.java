package irvine.oeis.a005;

import irvine.oeis.RevertTransformSequence;
import irvine.oeis.a014.A014103;

/**
 * A005149 Sequence of coefficients arising in connection with a rapidly converging series for <code>Pi</code>.
 * @author Sean A. Irvine
 */
public class A005149 extends RevertTransformSequence {

  /** Construct the sequence. */
  public A005149() {
    super(new A014103());
  }
}
