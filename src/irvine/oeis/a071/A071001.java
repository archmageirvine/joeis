package irvine.oeis.a071;

import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.a068.A068465;

/**
 * A071001 Binary expansion of gamma(3/4).
 * @author Sean A. Irvine
 */
public class A071001 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A071001() {
    super(1, A068465.GAMMA_THREE_QUARTERS, 2);
  }
}

