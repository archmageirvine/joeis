package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A048260 The sum of 2 (not necessarily distinct) abundant numbers.
 * @author Georg Fischer
 */
public class A048260 extends ComplementSequence {

  /** Construct the sequence. */
  public A048260() {
    super(new A048242(), Z.ONE);
  }
}
