package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A059390 Numbers that are not the sum of two nonzero Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A059390 extends ComplementSequence {

  /** Construct the sequence. */
  public A059390() {
    super(new A059389(), Z.ONE);
  }
}
