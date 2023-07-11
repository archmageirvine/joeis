package irvine.oeis.a058;
// manually compseq at 2021-09-27 19:03

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a057.A057843;
/**
 * A058065 Complement of A057843.
 * @author Georg Fischer
 */
public class A058065 extends ComplementSequence {

  /** Construct the sequence. */
  public A058065() {
    super(0, new A057843(), Z.ZERO);
  }
}
