package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a028.A028491;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075078.
 * @author Sean A. Irvine
 */
public class A075081 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075081() {
    super(1, new A028491(), Z.THREE::pow);
  }
}

