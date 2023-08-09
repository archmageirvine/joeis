package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a037.A037194;

/**
 * A065028 Integers which when written in French contain an odd number of vowels.
 * @author Sean A. Irvine
 */
public class A065028 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065028() {
    super(1, new A037194().skip(), Z::isOdd);
  }
}

