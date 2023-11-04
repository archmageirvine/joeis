package irvine.oeis.a066;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A036839.
 * @author Sean A. Irvine
 */
public class A066724 extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  {
    setOffset(0);
  }

  private boolean isOk(final Z t) {
    for (final Z a : this) {
      if (mForbidden.contains(a.multiply(t))) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    Z t = a(size() - 1);
    while (true) {
      t = t.add(1);
      if (!mForbidden.remove(t) && isOk(t)) {
        for (final Z a : this) {
          mForbidden.add(a.multiply(t));
        }
        return t;
      }
    }
  }
}
