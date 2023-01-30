package irvine.oeis.a061;

import irvine.math.group.SymmetricGroup;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061220 Least entry in character table of the symmetric group S_n.
 * @author Sean A. Irvine
 */
public class A061220 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z[][] ct = SymmetricGroup.create(++mN).characterTable();
    Z min = ct[0][0];
    for (final Z[] r : ct) {
      for (final Z v : r) {
        min = min.min(v);
      }
    }
    return min;
  }
}
