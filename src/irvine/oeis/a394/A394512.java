package irvine.oeis.a394;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a024.A024619;

/**
 * A394512 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A394512 extends TwoParameterFormSequence {

  private static final DirectSequence SEQ = DirectSequence.create(new A024619());

  /** Construct the sequence. */
  public A394512() {
    super(1, 0, 1, (k, m) -> SEQ.a(k).pow(SEQ.a(k).multiply(m)));
  }
}
