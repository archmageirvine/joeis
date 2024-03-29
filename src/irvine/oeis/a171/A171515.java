package irvine.oeis.a171;
// Generated by gen_seq4.pl partran at 2022-10-18 22:25

import irvine.oeis.a033.A033543;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A171515 Riordan array (f(x), x*f(x)) where f(x) is the g.f. of A033543.
 * @author Georg Fischer
 */
public class A171515 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A171515() {
    super(0, new A033543());
  }
}
