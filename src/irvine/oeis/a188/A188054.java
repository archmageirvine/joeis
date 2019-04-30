package irvine.oeis.a188;

import irvine.math.z.Z;
import irvine.oeis.StanleySequence;

/**
 * A188054 Stanley Sequence <code>S(0,1,5)</code>.
 * @author Sean A. Irvine
 */
public class A188054 extends StanleySequence {

  /** Construct the sequence. */
  public A188054() {
    super(Z.ZERO, Z.ONE, Z.FIVE);
  }
}
