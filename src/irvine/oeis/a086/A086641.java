package irvine.oeis.a086;

import irvine.math.group.DihedralCharacterTable;
import irvine.math.group.MatrixField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.CyclotomicExtension;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A086641 Permanents of the character tables that appear in A085805.
 * @author Sean A. Irvine
 */
public class A086641 extends Sequence1 {

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
      final Polynomial<Q> perm = new MatrixField<>(c.rows(), ring).permanent(c.matrix());
      if (!ring.isZero(perm)) {
        return perm.coeff(0).toZ();
      }
    }
  }
}
