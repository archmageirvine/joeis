package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056385 Number of primitive (aperiodic) step shifted (decimated) sequences using a maximum of six different symbols.
 * @author Sean A. Irvine
 */
public class A056385 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056385() {
    super(new A056375(), 0);
    next();
  }
}
