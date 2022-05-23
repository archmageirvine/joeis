package irvine.oeis.a038;

import java.util.LinkedList;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A038776 The sequence a[1] to a[ cat[n] ] is the permutation that converts forest[n] of depth-first planar planted binary trees into breadth-first representation.
 * @author Sean A. Irvine
 */
public class A038776 extends A014486 {

  {
    super.next(); // skip 0
  }

  private final TreeMap<Z, Long> mOrdering = new TreeMap<>();
  private final LinkedList<Z> mA = new LinkedList<>();
  private int mBitCount = 1;
  private long mM = 0;
  private long mN = -1;

  private void step() {
    Z t = super.next();
    if (t.bitCount() == mBitCount) {
      mOrdering.put(t, ++mN);
      mA.add(t);
    } else {
      mOrdering.clear();
      mA.clear();
      mN = mM - 1;
      for (int k = 0; k <= mN; ++k) {
        t = super.next();
      }
      mOrdering.put(t, ++mN);
      mA.add(t);
      mBitCount = t.bitCount();
    }
  }

  private long getIndex(final Z n) {
    while (!mOrdering.containsKey(n)) {
      step();
    }
    // We can remove because this is a permutation
    return mOrdering.remove(n);
  }

  private static class Node {
    private Node mLeft = null;
    private Node mRight = null;
  }

  private void dfs(final Node node, final StringBuilder sb) {
    if (node == null) {
      sb.append('0');
    } else {
      sb.append(1);
      dfs(node.mLeft, sb);
      dfs(node.mRight, sb);
    }
  }

  private Z bfsTodfs(final Z n) {
    if (n.isZero()) {
      return Z.ZERO;
    }
    final String s = n.toString(2);
    // Build dfs tree
    final Node root = new Node();
    final LinkedList<Node> bfs = new LinkedList<>();
    bfs.add(root);
    for (int k = 1; k + 1 < s.length(); k += 2) { // k == 0 is root
      final Node node = bfs.pollFirst();
      if (s.charAt(k) == '1') {
        final Node t = new Node();
        node.mLeft = t;
        bfs.add(t);
      }
      if (s.charAt(k + 1) == '1') {
        final Node t = new Node();
        node.mRight = t;
        bfs.add(t);
      }
    }
    final StringBuilder sb = new StringBuilder();
    dfs(root, sb);
    //System.out.println(s + " -> " + sb);
    return new Z(sb, 2).divide2(); // Ignore last implicit 0
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      step();
    }
    ++mM;
    return Z.valueOf(getIndex(bfsTodfs(mA.pollFirst())) + 1);
  }
}
