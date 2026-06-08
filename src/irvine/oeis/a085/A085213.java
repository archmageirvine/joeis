package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A085213 Array A085211 in binary.
 * @author Sean A. Irvine
 */
public class A085213 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A085213() {
    super(1, new A085211(), k -> new Z(k.toString(2)));
  }
}
