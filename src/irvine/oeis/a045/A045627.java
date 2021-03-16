package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.MobiusTransformSequence;
import irvine.oeis.a032.A032123;

/**
 * A045627.
 * @author Sean A. Irvine
 */
public class A045627 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A045627() {
    super(new A032123(), 1, Z.ONE);
  }
}
