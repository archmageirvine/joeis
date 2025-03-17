package irvine.oeis.a076;

import java.util.ArrayList;
import java.util.Collections;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076069 Largest number formed as concatenation of a permutation of the n consecutive numbers 1+n(n-1)/2, ..., n(n+1)/2 (written in decimal).
 * @author Sean A. Irvine
 */
public class A076069 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    ++mN;
    final ArrayList<String> lst = new ArrayList<>();
    for (int k = 0; k < mN; ++k) {
      lst.add(String.valueOf(++mM));
    }
    Collections.sort(lst);
    final StringBuilder sb = new StringBuilder();
    for (int k = lst.size() - 1; k >= 0; --k) {
      sb.append(lst.get(k));
    }
    return new Z(sb);
  }
}
