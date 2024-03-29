package irvine.oeis.a343;
// Generated by gen_seq4.pl dersimple at 2021-08-25 22:45

import irvine.math.z.Z;
import irvine.oeis.a002.A002860;

/**
 * A343697 a(n) is the number of preference profiles in the stable marriage problem with n men and n women such that both the men's and women's profiles form Latin squares.
 * @author Georg Fischer
 */
public class A343697 extends A002860 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
