package irvine.oeis.a003;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A003232 Expansion of <code>(x-1)*(x^2-4*x-1)/(1-2*x)^2</code>.
 * @author Sean A. Irvine
 */
public class A003232 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A003232() {
    super(new long[] {1, 3, -5, 1}, new long[] {1, -4, 4});
  }
}
