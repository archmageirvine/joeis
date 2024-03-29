package irvine.oeis.a105;
// Generated by gen_seq4.pl partran at 2022-10-18 22:25

import irvine.oeis.a141.A141044;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A105478 Triangle read by rows: T(n,k) is the number of compositions of n into k parts when parts 1 and 2 are of two kinds.
 * @author Georg Fischer
 */
public class A105478 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A105478() {
    super(1, new A141044());
  }
}
