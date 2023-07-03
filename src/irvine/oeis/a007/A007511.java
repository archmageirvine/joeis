package irvine.oeis.a007;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a025.A025426;

/**
 * A007511 a(n) is the smallest number greater than a(n-1) that is expressible as the sum of two squares in more ways than a(n-1).
 * @author Sean A. Irvine
 */
public class A007511 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A007511() {
    super(1, new A025426(), 0);
    next();
  }
}
