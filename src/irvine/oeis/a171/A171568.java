package irvine.oeis.a171;
// Generated by gen_seq4.pl partran at 2022-10-18 22:25

import irvine.oeis.a064.A064613;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A171568 Riordan array (f(x), x*f(x)) where f(x) is the g.f. of A064613.
 * @author Georg Fischer
 */
public class A171568 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A171568() {
    super(0, new A064613());
  }
}
