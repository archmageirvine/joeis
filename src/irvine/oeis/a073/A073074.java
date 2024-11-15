package irvine.oeis.a073;

import irvine.oeis.a000.A000069;
import irvine.oeis.transform.InverseAronsonTransformSequence;

/**
 * A073074 Inverse Aronson transform of odious numbers (A000069).
 * @author Sean A. Irvine
 */
public class A073074 extends InverseAronsonTransformSequence {

  /** Construct the sequence. */
  public A073074() {
    super(1, new A000069());
  }
}

