package irvine.oeis.a059;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057163;
import irvine.oeis.memory.MemorySequence;

/**
 * A059984 Concatenation of \u0141ukasiewicz words.
 * @author Sean A. Irvine
 */
public class A059984 extends A057163 {

  // A014486 generates of trees for each size n but not in the order needed here.
  // The order is apparently given by A057163.

  private final MemorySequence mA = MemorySequence.cachedSequence(new A014486());

  private List<Integer> mCurrentTree = Collections.emptyList();
  private int mN = 0; // Position in current tree

  private static void lukasiewicz(final List<Integer> lst, final SExpression s) {
    if (!s.isEmpty()) {
      for (final SExpression t : s) {
        lukasiewicz(lst, t);
      }
    }
    lst.add(s.size());
  }

  protected static List<Integer> lukasiewicz(final SExpression s) {
    final ArrayList<Integer> lst = new ArrayList<>();
    lukasiewicz(lst, s);
    return lst;
  }

  protected List<Integer> step() {
    return lukasiewicz(SExpression.binexp2pars(mA.a(super.next().intValueExact())));
  }

  @Override
  public Z next() {
    if (++mN >= mCurrentTree.size()) {
      mCurrentTree = step();
      mN = 0;
    }
    return Z.valueOf(mCurrentTree.get(mN));
  }
}
