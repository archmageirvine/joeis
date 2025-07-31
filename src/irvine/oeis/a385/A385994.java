package irvine.oeis.a385;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a229.A229939;

/**
 * A385994 allocated for Pierre-Alain Sallard.
 * @author Sean A. Irvine
 */
public class A385994 extends PartialSumSequence {

  /** Construct the sequence. */
  public A385994() {
    super(1, new A229939());
  }
}

