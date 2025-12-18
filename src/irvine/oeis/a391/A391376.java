package irvine.oeis.a391;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a390.A390952;

/**
 * A391376 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A391376 extends TwoParameterFormSequence {

  private static final DirectSequence A390952 = DirectSequence.create(new A390952());

  /** Construct the sequence. */
  public A391376() {
    super(1, 1, 2, (b, k) -> A390952.a(b.intValue()).pow(k));
  }
}
