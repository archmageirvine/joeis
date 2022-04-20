package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056404 Number of primitive (aperiodic) step shifted (decimated) sequence structures using a maximum of five different symbols.
 * @author Sean A. Irvine
 */
public class A056404 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056404() {
    super(new A056394(), 0);
    next();
  }
}
