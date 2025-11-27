package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A389887 allocated for Werner Schulte.
 * @author Sean A. Irvine
 */
public class A389887 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A389887() {
    super(1, (p, e) -> Z.THREE.add(Z.NEG_ONE.pow(e).multiply(2L * e + 1)).divide(4));
  }
}

