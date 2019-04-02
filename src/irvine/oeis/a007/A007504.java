package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000040;

/**
 * A007504 Sum of the first n primes.
 * @author Sean A. Irvine
 */
public class A007504 extends PartialSumSequence {

  /** Construct the sequence. */
  public A007504() {
    super(new PrependSequence(new A000040(), Z.ZERO));
  }
}
