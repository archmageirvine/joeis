package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a051.A051349;

/**
 * A060697 The sum of the first a(n) composite numbers plus 1 is a prime.
 * @author Sean A. Irvine
 */
public class A060697 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A060697() {
    super(1, -1, new A051349(), Z::isProbablePrime);
  }
}
