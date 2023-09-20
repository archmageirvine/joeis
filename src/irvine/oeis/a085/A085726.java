package irvine.oeis.a085;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000032;

/**
 * A085726 Numbers n such that n-th Lucas number is a semiprime.
 * @author Sean A. Irvine
 */
public class A085726 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A085726() {
    super(1, 0, new A000032(), SEMIPRIME);
  }
}
