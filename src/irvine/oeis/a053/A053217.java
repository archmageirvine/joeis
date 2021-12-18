package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a001.A001156;

/**
 * A053192.
 * @author Sean A. Irvine
 */
public class A053217 extends ComplementSequence {

  /** Construct the sequence. */
  public A053217() {
    super(new A001156(), Z.SEVEN);
  }
}
