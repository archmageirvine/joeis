package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.InverseMobiusTransformSequence;
import irvine.oeis.a000.A000055;

/**
 * A035054 Number of forests of identical trees.
 * @author Sean A. Irvine
 */
public class A035054 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A035054() {
    super(new A000055(), 1, Z.ONE);
  }
}
