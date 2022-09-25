package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a003.A003586;

/**
 * A059485 Highest prime factor is greater than 3.
 * @author Sean A. Irvine
 */
public class A059485 extends ComplementSequence {

  /** Construct the sequence. */
  public A059485() {
    super(new A003586(), Z.ONE);
  }
}
