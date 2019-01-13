package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a001.A001944;

/**
 * A004437.
 * @author Sean A. Irvine
 */
public class A004437 extends ComplementSequence {

  /** Construct the sequence. */
  public A004437() {
    super(new A001944(), Z.ONE);
  }
}
