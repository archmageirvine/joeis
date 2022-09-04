package irvine.oeis.a058;

import java.util.Arrays;
import java.util.LinkedList;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A058889 Arrange binary trees in natural sequential order (see examples); sequence gives numbers of nodes.
 * @author Sean A. Irvine
 */
public class A058889 extends A014486 {

  private int count(final Node n) {
    if (n == null) {
      return 0;
    }
    return 1 + count(n.mLeft) + count(n.mRight);
  }

  private int count(final SExpression n) {
    if (n.isEmpty()) {
      return 0;
    }
    return 1 + count(n.car()) + count(n.cdr());
  }

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
    return root;
  }

  private int[] mP = new int[1000];
  private int[] mLB = new int[mP.length];
  private int[] mUB = new int[mP.length];
  private int mN = 0;

  private void permute(final int i) {
    for (int x = mLB[i]; x <= mUB[i]; ++x) {
      mP[i] = x;
      if (i == mN) {
        // todo print
        System.out.println(Arrays.toString(mP));
      } else {
        if (mLB[i] < x) {
          mLB[i + 1] = mLB[i];
          mUB[i + 1] = x - 1;
        }
        if (x < mUB[i]) {
          mLB[i + x - mLB[i] + 1] = x + 1;
          mUB[i + x - mLB[i] + 1] = mUB[i];
        }
        permute(i + 1);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mLB[1] = 1;
    mUB[1] = 1;
    permute(1);
//    System.out.println(new SExpression().toZ());
//    System.out.println(new SExpression(new SExpression(), new SExpression()).toZ());
//    System.out.println(new SExpression(new SExpression(), new SExpression(new SExpression(), new SExpression())).toZ());
//    System.out.println(new SExpression(new SExpression(new SExpression(), new SExpression()), new SExpression()).toZ());
//    System.out.println(new SExpression(new SExpression(new SExpression(), new SExpression()), new SExpression(new SExpression(), new SExpression())).toZ());
//    System.out.println(new SExpression(new SExpression(), new SExpression(new SExpression(), new SExpression(new SExpression(), new SExpression()))).toZ());
//    System.out.println(new SExpression(new SExpression(new SExpression(), new SExpression(new SExpression(), new SExpression())), new SExpression()).toZ());

    final Z t = super.next();
    System.out.println("pop=" + t.bitCount());

    final SExpression s = SExpression.binexp2pars(super.next());
    //final Node s = toBfs(super.next());
    System.out.println(s);
    return Z.valueOf(count(s));
  }
}
