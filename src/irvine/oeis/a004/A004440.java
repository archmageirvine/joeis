package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A004440.
 * @author Sean A. Irvine
 */
public class A004440 extends ComplementSequence {

  /** Construct the sequence. */
  public A004440() {
    super(new A004432(), Z.ONE);
  }
}
