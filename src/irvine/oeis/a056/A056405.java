package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056405 Number of primitive (aperiodic) step shifted (decimated) sequence structures using a maximum of six different symbols.
 * @author Sean A. Irvine
 */
public class A056405 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056405() {
    super(new A056395(), 0);
    next();
  }
}
