package irvine.oeis.a062;

import java.util.HashSet;

import irvine.math.api.Field;
import irvine.math.api.Group;
import irvine.math.api.Matrix;
import irvine.math.group.GaloisField;
import irvine.math.group.SpecialLinearGroup;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062314 Number of cyclic subgroups of the group SL(n,3) (the group of nonsingular n X n matrices over GF(3) with determinant 1 ).
 * @author Sean A. Irvine
 */
public class A062314 extends Sequence1 {

  // This is really slow as it constructs all the groups.
  // There is likely some kind of cycle index solution for this (cf. A058502).

  private int mN = 0;
  private final Field<Z> mFld;

  protected A062314(final GaloisField field) {
    mFld = field;
  }

  /** Construct the sequence. */
  public A062314() {
    this(new GaloisField(3));
  }

  @Override
  public Z next() {
    final SpecialLinearGroup<Z> sl = new SpecialLinearGroup<>(++mN, mFld);
    final HashSet<Group<Matrix<Z>>> seen = new HashSet<>();
    for (final Matrix<Z> e : sl) {
      seen.add(sl.subgroup(e));
    }
    return Z.valueOf(seen.size());
  }
}
