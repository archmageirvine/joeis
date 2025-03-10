package irvine.oeis.a057;

import java.util.LinkedList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A057117 Permutation of nonnegative integers obtained by mapping each forest of A000108[n] rooted binary plane trees from breadth-first to depth-first encoding.
 * @author Sean A. Irvine
 */
public class A057117 extends A014486 {

  static class Node {
    Node mLeft = null;
    Node mRight = null;
  }

  private static void dfs(final Node node, final StringBuilder sb) {
    if (node == null) {
      sb.append('0');
    } else {
      sb.append(1);
      dfs(node.mLeft, sb);
      dfs(node.mRight, sb);
    }
  }

  static Node toBfs(final Z n) {
    final String s = n.toString(2);
    // Build bfs tree
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
    return root;
  }

  /**
   * Convert from breadth first to depth first representation
   * @param n tree
   * @return transformed
   */
  public static Z bfsToDfs(final Z n) {
    if (n.isZero()) {
      return Z.ZERO;
    }
    final Node root = toBfs(n);
    final StringBuilder sb = new StringBuilder();
    dfs(root, sb);
    //System.out.println(s + " -> " + sb);
    return new Z(sb, 2).divide2(); // Ignore last implicit 0
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(bfsToDfs(super.next()));
  }
}
