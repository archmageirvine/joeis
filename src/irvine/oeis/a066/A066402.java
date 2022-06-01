package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A066402 From expansion of Belyi function for dodecahedron.
 * @author Sean A. Irvine
 */
public class A066402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066402() {
    super(new long[] {-1, -684, -157434, -12527460, -77460495, -130689144, 33211924, 130689144, -77460495, 12527460, -157434, 684},
      new Z[] {Z.ZERO, Z.ONE, Z.valueOf(739), Z.valueOf(349247), Z.valueOf(135081772), Z.valueOf(46592981880L), Z.valueOf(14921201253592L), Z.valueOf(4536057410542618L), Z.valueOf(1326832753715385794L), new Z("376757242809990931884"), new Z("104488934104327921610570"), new Z("28428461728083557062643114")});
  }
}
