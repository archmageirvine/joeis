package irvine.oeis.a188;

import irvine.math.z.Z;
import irvine.oeis.StanleySequence;

/**
 * A188053 Stanley Sequence <code>S(0,1,4)</code>.
 * @author Sean A. Irvine
 */
public class A188053 extends StanleySequence {

  /** Construct the sequence. */
  public A188053() {
    super(Z.ZERO, Z.ONE, Z.FOUR);
  }
}
