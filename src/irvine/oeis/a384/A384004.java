package irvine.oeis.a384;

import irvine.oeis.InverseSequence;
import irvine.oeis.a010.A010846;

/**
 * A384004 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A384004 extends InverseSequence {

  /** Construct the sequence. */
  public A384004() {
    super(1, new A010846());
  }
}

