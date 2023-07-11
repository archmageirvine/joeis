package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a128.A128014;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A045680 Number of 2n-bead balanced binary necklaces of fundamental period 2n equivalent to reverse.
 * @author Sean A. Irvine
 */
public class A045680 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A045680() {
    super(0, new A128014(), 1, Z.ONE);
  }
}

