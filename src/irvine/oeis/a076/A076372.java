package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A076372 Numbers arising once in A076370, the "Primorial-Cut-Sequence", i.e., subscripts k where A076371(k) = 1.
 * @author Sean A. Irvine
 */
public class A076372 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A076372() {
    super(1, 1, new A076371(), Z.ONE::equals);
  }
}
