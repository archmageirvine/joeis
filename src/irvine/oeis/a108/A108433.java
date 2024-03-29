package irvine.oeis.a108;
// Generated by gen_seq4.pl partran at 2022-10-18 22:25

import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A108433 Triangle read by rows: T(n,k) is number of paths from (0,0) to (3n,0) that stay in the first quadrant (but may touch the horizontal axis), consisting of steps u=(2,1), U=(1,2), or d=(1,-1) and have k hills of the form ud (a hill is either a ud or a Udd starting at the x-axis).
 * @author Georg Fischer
 */
public class A108433 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A108433() {
    super(0, new A108434());
  }
}
