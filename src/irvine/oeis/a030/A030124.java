package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a005.A005228;

/**
 * A030124 Complement (and also first differences) of Hofstadter's sequence A005228.
 * @author Sean A. Irvine
 */
public class A030124 extends ComplementSequence {

  /** Construct the sequence. */
  public A030124() {
    super(new A005228(), Z.TWO);
  }
}
