package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a075.A075998;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076001 (1/2)*A075998.
 * @author Sean A. Irvine
 */
public class A076001 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076001() {
    super(new A075998(), Z::divide2);
  }
}
