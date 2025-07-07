package irvine.oeis.a118;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a078.A078605;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A118313 Sum of squared end-to-end distances of all n-step self-avoiding walks on the simple cubic lattice.
 * @author Sean A. Irvine
 */
public class A118313 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A118313() {
    super(0, new PrependSequence(new A078605(), 0), Z.SIX::multiply);
  }
}
