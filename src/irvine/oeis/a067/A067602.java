package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A067602 5^n reduced modulo 3^n.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A067602 extends LambdaSequence {

  /** Construct the sequence. */
  public A067602() {
    super(0, n -> Z.FIVE.modPow(Z.valueOf(n), Z.THREE.pow(n)));
  }
}
