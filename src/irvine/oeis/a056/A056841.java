package irvine.oeis.a056;

import java.util.ArrayList;

import irvine.math.z.Z;

/**
 * A056841 Number of diagonal polyominoes with n cells.
 * @author R. J. Mathar
 * @author Sean A. Irvine (Java port)
 */
public class A056841 extends A056787 {

  private static final int[] DELTA_X = {1, 0, -1, 0};
  private static final int[] DELTA_Y = {0, 1, 0, -1};

  @Override
  protected int maxDir() {
    return 4;
  }

  @Override
  protected A056787.Node create(final Node n, final int dir) {
    /* For values of the dir argument from 0 to 3
     * we create the new node one step into the East (+x),
     * North (+y), West (-x) or South (-y) from the original one.
     */
    return new Node(n.x() + DELTA_X[dir], n.y() + DELTA_Y[dir]);
  }

  @Override
  public Z next() {
    // The initialization here is done in a hacky way to handle n=0 case
    if (mA == null) {
      mA = new ArrayList<>();
      return Z.ONE;
    } else if (mA.isEmpty()) {
      final Tree root1 = new Tree(0, 0, 1, 0);
      final Edge strt1 = new Edge(new Node(0, 0), new Node(1, 0));
      root1.addEdge(strt1);
      mA.add(root1);
    } else {
      mA = step(mA);
    }
    return Z.valueOf(mA.size());
  }
}
