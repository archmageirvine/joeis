package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a018.A018940;

/**
 * A019266 Cycle class sequence <code>c(2n) (the</code> number of true cycles of length <code>2n</code> in which a certain node is included) for square lattice.
 * @author Sean A. Irvine
 */
public class A019266 extends PrependSequence {

  /** Construct the sequence. */
  public A019266() {
    super(new A018940() {
      @Override
      protected String startNode() {
        return "a";
      }

      @Override
      protected String getNeighbourhoodDescription() {
        // square lattice (2d)
        return "a: a(+00) a(0+0)\n";
      }
    }, Z.ONE, Z.ZERO);
  }
}

