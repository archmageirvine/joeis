package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A076425 Numbers n such that zero is never reached by iterating the mapping k -&gt; abs(reverse(lpd(k))-reverse(gpf(k))). lpd(k) is the largest proper divisor and gpf(k) is the largest prime factor of k.
 * @author Sean A. Irvine
 */
public class A076425 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A076425() {
    super(1, 1, new A076423(), Z.NEG_ONE::equals);
  }
}
