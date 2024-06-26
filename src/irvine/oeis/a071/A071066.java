package irvine.oeis.a071;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071013.
 * @author Sean A. Irvine
 */
public class A071066 extends Sequence1 {

  // todo this is temporary
  // todo the sequence requires making the deepest possible not just the smallest

  private static final Z[] MUL_TABLE = new Z[250];

  static {
    MUL_TABLE[1] = Z.valueOf(10000);
    for (int k = 2; k < MUL_TABLE.length; ++k) {
      MUL_TABLE[k] = MUL_TABLE[k - 1].multiply(1000000);
    }
  }

  private List<Z> mBest = Collections.emptyList();

  private void search(final List<Z> lst) {
    final int n = lst.size();
    if (n > mBest.size()) {
      mBest = new ArrayList<>(lst);
      System.out.println(lst);
      System.out.println("New best: " + mBest.size());
    }
    final Z a = lst.get(n - 1).multiply(1000);
    for (long k = 100; k < 1000; ++k) {
      final Z t = MUL_TABLE[n].multiply(k).add(a).add(Functions.REVERSE.l(k));
      if (t.isProbablePrime()) {
        lst.add(t);
        search(lst);
        lst.remove(lst.size() - 1);
      }
    }
  }

  @Override
  public Z next() {
    final ArrayList<Z> lst = new ArrayList<>();
    lst.add(Z.TWO);
    //search(lst);
    return null; // Sequence is finite
  }
}
