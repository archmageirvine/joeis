package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a000.A000055;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A035054 Number of forests of identical trees.
 * @author Sean A. Irvine
 */
public class A035054 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A035054() {
    super(0, new A000055(), 1, Z.ONE);
  }
}
