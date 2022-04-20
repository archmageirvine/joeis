package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056403 Number of primitive (aperiodic) step shifted (decimated) sequence structures using a maximum of four different symbols.
 * @author Sean A. Irvine
 */
public class A056403 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056403() {
    super(new A056393(), 0);
    next();
  }
}
