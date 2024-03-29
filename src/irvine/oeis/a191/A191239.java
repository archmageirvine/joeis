package irvine.oeis.a191;
// Generated by gen_seq4.pl partran at 2022-10-18 22:25

import irvine.oeis.a130.A130779;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A191239 Triangle T(n,k) = coefficient of x^n in expansion of (x+x^2+2*x^3)^k.
 * @author Georg Fischer
 */
public class A191239 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A191239() {
    super(1, new A130779());
  }
}
