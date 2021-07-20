package irvine.oeis.a226;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.a106.A106533;

/**
 * A226775 Decimal expansion of the number x other than -2 defined by x*exp(x) = -2/e^2.
 * @author Sean A. Irvine
 */
public class A226775 extends DecimalExpansionSequence {

  /** A226775 as a real. */
  public static final CR N = A106533.RUMOUR_CONSTANT.multiply(CR.TWO);

  /** Construct the sequence. */
  public A226775() {
    super(N);
  }
}

