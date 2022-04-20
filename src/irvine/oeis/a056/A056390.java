package irvine.oeis.a056;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A056390 Number of primitive (aperiodic) step shifted (decimated) sequences using exactly six different symbols.
 * @author Sean A. Irvine
 */
public class A056390 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A056390() {
    super(new A056380(), 0);
    next();
  }
}
