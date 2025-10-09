package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A005224 T is the first, fourth, eleventh, ... letter in this sentence, not counting spaces or commas (Aronson's sequence).
 * @author Sean A. Irvine
 */
public class A081024 extends ComplementSequence {

  /** Construct the sequence. */
  public A081024() {
    super(1, Z.ONE, new A081023());
  }
}

