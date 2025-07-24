package irvine.oeis.a078;

import irvine.oeis.a272.A272037;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A078975 Decimal expansion of constant C&gt;0 such that sum(k&gt;=1,1/C^(k^2)) = 1.
 * @author Sean A. Irvine
 */
public class A078975 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A078975() {
    super(0, new A272037().getCR().inverse());
  }
}
