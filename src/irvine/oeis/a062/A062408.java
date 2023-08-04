package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a022.A022844;

/**
 * A062408 Numbers k such that floor(Pi*k) is prime.
 * @author Sean A. Irvine
 */
public class A062408 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A062408() {
    super(0, 0, new A022844(), Z::isProbablePrime);
  }
}

