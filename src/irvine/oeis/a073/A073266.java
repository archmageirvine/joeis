package irvine.oeis.a073;
// Generated by gen_seq4.pl partran at 2022-10-18 22:25

import irvine.oeis.a036.A036987;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A073266 Triangle read by rows: T(n,k) is the number of compositions of n as the sum of k integral powers of 2.
 * @author Georg Fischer
 */
public class A073266 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A073266() {
    super(1, new A036987());
  }
}
