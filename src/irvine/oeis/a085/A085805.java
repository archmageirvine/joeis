package irvine.oeis.a085;

import irvine.math.group.DihedralCharacterTable;
import irvine.math.group.MatrixField;
import irvine.math.q.CyclotomicExtension;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A085547.
 * @author Sean A. Irvine
 */
public class A085805 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mVerbose) {
        StringUtils.message("Trying order: " + 2 * mN);
      }
      final DihedralCharacterTable c = new DihedralCharacterTable(mN);
      final CyclotomicExtension ring = c.ring();
      if (!ring.isZero(new MatrixField<>(c.rows(), ring).permanent(c.matrix()))) {
        return Z.valueOf(2L * mN);
      }
    }
  }
}
