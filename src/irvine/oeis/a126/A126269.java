package irvine.oeis.a126;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A126269 Numbers n such that hcl(n,n) &lt; hcl(n,n-1) where hcl(n,i) is the Huffman code length; see comments.
 * @author Sean A. Irvine
 */
public class A126269 extends Sequence3 {

  // There are conjectured formulas for this which are fast,
  // but we do it explicitly here to demonstrate the Huffman process.

  private int mN = 2;

  private static final class Node implements Comparable<Node> {
    private static long sId = 0;
    final long mN;
    final long mId = ++sId; // one up counter for all nodes generated
    final Node mLeft;
    final Node mRight;

    private Node(final int n) {
      mN = n;
      mLeft = null;
      mRight = null;
    }

    private Node(final Node a, final Node b) {
      mN = a.mN + b.mN; // we are treating this as a frequency
      mLeft = a;
      mRight = b;
    }

    @Override
    public int compareTo(final Node o) {
      final int c = Long.compare(mN, o.mN);
      if (c != 0) {
        return c;
      }
      return Long.compare(mId, o.mId); // disambiguate different nodes
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof Node && mId == ((Node) obj).mId;
    }

    @Override
    public int hashCode() {
      return (int) mId;
    }

    @Override
    public String toString() {
      return "(" + (mLeft == null ? mN : mLeft + "," + mRight) + ")";
    }
  }

  private Node buildHuffman(final long n) {
    final TreeSet<Node> tree = new TreeSet<>();
    for (int k = 1; k <= n; ++k) {
      tree.add(new Node(k));
    }
    while (tree.size() > 1) {
      tree.add(new Node(tree.pollFirst(), tree.pollFirst()));
    }
    return tree.pollFirst();
  }

  private void setLengths(final int[] lengths, final Node node, final int depth) {
    if (node.mLeft == null) {
      assert node.mRight == null;
      lengths[(int) node.mN] = depth;
      return;
    }
    assert node.mRight != null;
    setLengths(lengths, node.mLeft, depth + 1);
    setLengths(lengths, node.mRight, depth + 1);
  }

  @Override
  public Z next() {
    while (true) {
      final Node huffman = buildHuffman(++mN);
      final int[] lengths = new int[mN + 1];
      setLengths(lengths, huffman, 0);
      if (lengths[mN] < lengths[mN - 1]) {
        return Z.valueOf(mN);
      }
    }
  }
}
