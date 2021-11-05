package irvine.oeis.a269;
// manually deris2/compseq at 2021-11-04 22:44

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
/**
 * A269023 Complement of A269020: numbers not of the form ceiling(n^(1+1/n)).
 * @author Georg Fischer
 */
public class A269023 extends ComplementSequence {

  /** Construct the sequence. */
  public A269023() {
    super(new A269020(), Z.ONE);
  }
}
