package irvine.oeis.a176;

import irvine.math.z.Z;
import irvine.oeis.a397.A397808;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A176999 An encoding of the Collatz iteration of n.
 * @author Sean A. Irvine
 */
public class A176999 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A176999() {
    super(1, new A397808().skip(), k -> new Z(k.toString(2)));
  }
}
