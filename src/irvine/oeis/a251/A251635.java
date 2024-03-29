package irvine.oeis.a251;
// Generated by gen_seq4.pl tritoep

import irvine.oeis.recur.PaddingSequence;
import irvine.oeis.triangle.ToeplitzTriangle;

/**
 * A251635 Riordan array (1-2*x,x), inverse of Riordan array (1/(1-2*x), x) = A130321.
 * @author Georg Fischer
 */
public class A251635 extends ToeplitzTriangle {

  /** Construct the sequence. */
  public A251635() {
    super(0, new PaddingSequence("1,-2", "0"));
  }
}

