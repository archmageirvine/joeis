package irvine.oeis.a056;

import irvine.oeis.PeriodicSequence;

/**
 * A056594 Periodic sequence <code>1,0,-1,0,..</code>.; expansion of <code>1/(1 + x^2)</code>.
 * @author Sean A. Irvine
 */
public class A056594 extends PeriodicSequence {

  /** Construct the sequence. */
  public A056594() {
    super(1, 0, -1, 0);
  }
}

