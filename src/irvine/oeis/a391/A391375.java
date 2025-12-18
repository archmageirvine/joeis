package irvine.oeis.a391;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a390.A390953;

/**
 * A391375 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A391375 extends TwoParameterFormSequence {

  private static final DirectSequence A390953 = DirectSequence.create(new A390953());

  /** Construct the sequence. */
  public A391375() {
    super(1, 1, 2, (b, k) -> A390953.a(b.intValue()).pow(k));
  }
}
