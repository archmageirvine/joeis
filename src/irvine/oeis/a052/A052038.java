package irvine.oeis.a052;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A052038 First nonzero digit in expansion of 1/n.
 * @author Sean A. Irvine
 */
public class A052038 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final DecimalExpansionSequence seq = new DecimalExpansionSequence(CR.valueOf(++mN).inverse());
    while (true) {
      final Z t = seq.next();
      if (!t.isZero()) {
        return t;
      }
    }
  }
}
