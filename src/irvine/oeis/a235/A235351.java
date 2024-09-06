package irvine.oeis.a235;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.GeneratingFunctionSequence;
import irvine.oeis.transform.RevertTransformSequence;

/**
 * A235351 Series reversion of x*(1-3*x-2*x^2)/(1-x).
 * @author Georg Fischer
 */
public class A235351 extends PrependSequence {

  /** Construct the sequence. */
  public A235351() {
    super(0, new RevertTransformSequence(0, new GeneratingFunctionSequence(new long[]{1, -3, -2}, new long[]{1, -1})), 0);
  }
}
