package irvine.oeis.a084;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A084842 Number of rooted trees with n nodes with a height of 2 and with at least 1 node at height 1 has degree &gt; 2.
 * @author Sean A. Irvine
 */
public class A084842 extends AbstractSequence {

  // todo is the OEIS erroneous

  // Stores out degrees of nodes below the root
  private HashSet<List<Integer>> mTrees = new HashSet<>();

  /** Construct the sequence. */
  public A084842() {
    super(4);
  }

  @Override
  public Z next() {
    if (mTrees.isEmpty()) {
      mTrees.add(Collections.singletonList(2));
    } else {
      final HashSet<List<Integer>> newTrees = new HashSet<>();
      for (final List<Integer> t : mTrees) {
        // Add a new level 1 node
        final List<Integer> t1 = new ArrayList<>(t);
        t1.add(0);
        newTrees.add(t1);
        // Bump the degree of subtrees where possible
        for (int k = 0; k < t.size(); ++k) {
          if (k == 0 || t.get(k) < t.get(k - 1)) {
            final List<Integer> tk = new ArrayList<>(t);
            tk.set(k, tk.get(k) + 1);
            newTrees.add(tk);
          }
        }
      }
      mTrees = newTrees;
    }
    if (mTrees.size() == 36) {
      System.out.println(mTrees);
    }
    return Z.valueOf(mTrees.size());
  }
}
