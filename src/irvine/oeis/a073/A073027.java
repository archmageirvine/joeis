package irvine.oeis.a073;

import java.util.ArrayList;
import java.util.List;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A073027 Square array of decimal expansions of sqrt(n) (n&gt;=1) read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A073027 extends Sequence1 {

  private final List<DecimalExpansionSequence> mA = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= mA.size()) {
      mA.add(new DecimalExpansionSequence(CR.valueOf(mN + 1).sqrt()));
      mN = 0;
    }
    return mA.get(mN).next();
  }
}
