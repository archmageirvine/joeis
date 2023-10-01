package irvine.oeis.a066;

import irvine.math.group.GroupFactory;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A066060 Number of nilpotent groups of order n.
 * @author Sean A. Irvine
 */
public class A066060 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A066060() {
    super(1, (p, e) -> Z.valueOf(GroupFactory.smallGroups(p.pow(e).intValueExact()).size()));
  }

}
