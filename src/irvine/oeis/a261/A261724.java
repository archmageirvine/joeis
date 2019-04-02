package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261724 a(n) is the number of ways of putting n labeled balls into 4 indistinguishable boxes such that each box contains at least 3 balls.
 * @author Sean A. Irvine
 */
public class A261724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261724() {
    super(new long[] {-3456, 37152, -184752, 563888, -1181760, 1802474, -2068955, 1822478, -1244717, 661180, -272198, 85924, -20386, 3514, -415, 30}, new long[] {15400, 200200, 1611610, 10335325, 57962905, 297797500, 1439774336, 6662393738L, 29844199346L, 130445781284L, 559533979466L, 2365296391535L, 9885290914059L, 40944327590760L, 168389163468240L, 688631376550260L});
  }
}
