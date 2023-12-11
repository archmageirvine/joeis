package irvine.oeis.a005;

import irvine.oeis.a014.A014103;
import irvine.oeis.transform.RevertTransformSequence;

/**
 * A005149 Sequence of coefficients arising in connection with a rapidly converging series for Pi.
 * @author Sean A. Irvine
 */
public class A005149 extends RevertTransformSequence {

  /** Construct the sequence. */
  public A005149() {
    super(new A014103());
  }
}
