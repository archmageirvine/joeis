package irvine.oeis.a085;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085693 Let f(0) = 1, f(1) = 12, f(2) = 223, f(3) = 3334, = f(4) = 44445, f(5) = 555556, etc. Sequence gives concatenation of 0, f(0), f(f(0)), f(f(f(0))), ...
 * @author Sean A. Irvine
 */
public class A085693 extends Sequence0 {

  private int mM = -1;
  private List<Integer> mL = Collections.singletonList(0);

  private List<Integer> f(final List<Integer> l) {
    final ArrayList<Integer> res = new ArrayList<>();
    for (final int v : l) {
      if (v == 0) {
        res.add(1);
      } else {
        for (int k = 0; k < v; ++k) {
          res.add(v);
        }
        res.add(v + 1);
      }
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mM >= mL.size()) {
      mL = f(mL);
      mM = 0;
    }
    return Z.valueOf(mL.get(mM));
  }
}

