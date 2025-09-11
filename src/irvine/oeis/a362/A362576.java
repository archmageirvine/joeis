package irvine.oeis.a362;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a291.A291593;

/**
 * A362576 Number of vertex cuts in the n X n rook complement graph.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A362576 extends LambdaSequence {

  private static final DirectSequence A291593 = new A291593();

  /** Construct the sequence. */
  public A362576() {
    super(1, n -> n <= 2 ? Z.ZERO : Z.TWO.pow((long) n * n).subtract(Z.ONE).subtract(A291593.a(n)));
  }
}
