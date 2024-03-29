package irvine.oeis.a067;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a048.A048161;

/**
 * A067756 Prime hypotenuses of Pythagorean triangles with a prime leg.
 * @author Georg Fischer
 */
public class A067756 extends Sequence1 {

  final Sequence mA048161 = new A048161();
  @Override
  public Z next() {
    return mA048161.next().square().add(Z.ONE).divide(Z.TWO);
  }

}
