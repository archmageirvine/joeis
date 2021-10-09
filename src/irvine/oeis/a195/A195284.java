package irvine.oeis.a195;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A195284 Decimal expansion of shortest length of segment from side AB through incenter to side AC in right triangle ABC with sidelengths (a,b,c)=(3,4,5); i.e., decimal expansion of 2*sqrt(10)/3.
 * @author Sean A. Irvine
 */
public class A195284 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A195284() {
    super(CR.valueOf(new Q(40, 9)).sqrt());
  }
}
