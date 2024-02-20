package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a008.A008864;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A068504 Highest power of 2 dividing prime(n)+1.
 * @author Sean A. Irvine
 */
public class A068504 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A068504() {
    super(1, new A008864(), k -> Z.ONE.shiftLeft(k.makeOdd().auxiliary()));
  }
}

