package irvine.oeis.a075;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075522.
 * @author Sean A. Irvine
 */
public class A075533 extends Sequence1 {

  // This explicitly constructs the relevant trees.

  static final class Tree implements Comparable<Tree> {
    private final ArrayList<Tree> mChildren;

    private Tree(final Tree... nodes) {
      mChildren = new ArrayList<>();
      Collections.addAll(mChildren, nodes);
    }

    @Override
    public int compareTo(final Tree tree) {
      final int c = Integer.compare(mChildren.size(), tree.mChildren.size());
      if (c != 0) {
        return c;
      }
      for (int k = 0; k < mChildren.size(); ++k) {
        final int d = mChildren.get(k).compareTo(tree.mChildren.get(k));
        if (d != 0) {
          return d;
        }
      }
      return 0;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Tree)) {
        return false;
      }
      final Tree other = (Tree) obj;
      return mChildren.equals(other.mChildren);
    }

    @Override
    public int hashCode() {
      return mChildren.hashCode();
    }

    private Tree deepCopy() {
      final Tree copy = new Tree();
      for (final Tree t : mChildren) {
        copy.mChildren.add(t.deepCopy());
      }
      return copy;
    }

    @Override
    public String toString() {
      final StringBuilder sb = new StringBuilder().append('(');
      for (final Tree t : mChildren) {
        sb.append(t.toString());
      }
      sb.append(')');
      return sb.toString();
    }

    private Tree canon() {
      if (mChildren.isEmpty()) {
        return this;
      }
      final Tree c = new Tree();
      for (final Tree t : mChildren) {
        c.mChildren.add(t.canon());
      }
      c.mChildren.sort(Comparator.comparing(Tree::toString));
      return c;
    }

    private Z sizeAut() {
      if (mChildren.isEmpty()) {
        return Z.ONE;
      }
      Z aut = Z.ONE;
      Tree b = null;
      Z baut = Z.ZERO;
      long mul = 1;
      for (final Tree c : mChildren) {
        if (c.equals(b)) {
          aut = aut.multiply(baut).multiply(++mul);
        } else {
          b = c;
          baut = c.sizeAut();
          aut = aut.multiply(baut);
          mul = 1;
        }
      }
      return aut;
    }
  }

  private static final class State implements Comparable<State> {

    private final int mN;
    private final Tree mTree;

    private State(final int n, final Tree tree) {
      mN = n;
      mTree = tree;
    }

    @Override
    public int compareTo(final State state) {
      final int c = Integer.compare(mN, state.mN);
      if (c != 0) {
        return c;
      }
      return mTree.compareTo(state.mTree);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mN == other.mN && mTree.equals(other.mTree);
    }

    @Override
    public int hashCode() {
      return mN + mTree.hashCode();
    }
  }

  private final TreeSet<State> mTrees = new TreeSet<>();
  private int mN = 0;
  {
    mTrees.add(new State(1, new Tree()));
  }

  private void expand(final State state, final Tree currentNode, final int currentHeight) {
    if (currentNode.mChildren.size() == 0) {
      for (int k = 0; k < currentHeight; ++k) {
        currentNode.mChildren.add(new Tree());
      }
      mTrees.add(new State(state.mN + currentHeight, state.mTree.deepCopy().canon()));
      currentNode.mChildren.clear();
    } else {
      Tree prev = null;
      for (int k = 0; k < currentNode.mChildren.size(); ++k) {
        final Tree t = currentNode.mChildren.get(k);
        if (!t.equals(prev)) { // Only try an expansion if it is potentially different
          prev = t;
          expand(state, t, currentHeight + 1);
        }
      }
    }
  }

  protected Z count(final Tree tree) {
    return Functions.FACTORIAL.z(mN).divide(tree.sizeAut());
  }

  @Override
  public Z next() {
    ++mN;
    Z cnt = Z.ZERO;
    while (mTrees.first().mN == mN) {
      final State s = mTrees.pollFirst();
      cnt = cnt.add(count(s.mTree));
      expand(s, s.mTree, 1);
    }
    return cnt;
  }
}

