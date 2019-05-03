package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A003257 Complement of <code>A003256</code>.
 * @author Sean A. Irvine
 */
public class A003257 extends ComplementSequence {

  /** Construct the sequence. */
  public A003257() {
    super(new A003256(), Z.ONE);
  }
}
