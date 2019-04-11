package irvine.oeis.a007;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a025.A025426;

/**
 * A007511 <code>a(n)</code> is the smallest number greater than <code>a(n-1)</code> that is expressible as the sum of two squares in more ways than <code>a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A007511 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A007511() {
    super(new A025426(), 0);
    next();
  }
}
