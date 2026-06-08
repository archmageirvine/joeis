package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A085214 Array A085212 in binary.
 * @author Sean A. Irvine
 */
public class A085214 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A085214() {
    super(1, new A085212(), k -> new Z(k.toString(2)));
  }
}
