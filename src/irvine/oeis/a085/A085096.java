package irvine.oeis.a085;

import irvine.oeis.InverseSequence;
import irvine.oeis.a082.A082744;

/**
 * A085096 Index of the first occurrence of n in A082744, or 0 if n does not occur in the sequence A082744.
 * @author Sean A. Irvine
 */
public class A085096 extends InverseSequence {

  /** Construct the sequence. */
  public A085096() {
    super(1, new A082744());
  }
}

