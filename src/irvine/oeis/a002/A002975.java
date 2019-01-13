package irvine.oeis.a002;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a006.A006037;

/**
 * A002975.
 * @author Sean A. Irvine
 */
public class A002975 extends A006037 {

  private final ArrayList<Z> mWeird = new ArrayList<>();

  @Override
  public Z next() {
    while (true) {
      final Z w = super.next();
      boolean primitive = true;
      for (final Z q : mWeird) {
        if (Z.ZERO.equals(w.mod(q))) {
          primitive = false;
          break;
        }
      }
      mWeird.add(w);
      if (primitive) {
        return w;
      }
    }
  }
}
