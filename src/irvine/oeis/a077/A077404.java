package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A077404 Trajectory of n under the Reverse and Add! operation carried out in base 3 (presumably) does not reach a palindrome.
 * @author Sean A. Irvine
 */
public class A077404 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A077404() {
    super(1, 0, new A077402(), Z.NEG_ONE::equals);
  }
}
