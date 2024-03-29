package irvine.oeis.a191;
// Generated by gen_seq4.pl a190803 at 2021-09-02 16:29

import irvine.math.z.Z;
import irvine.oeis.a190.A190803;

/**
 * A191328 Increasing sequence generated by these rules:  a(1)=1, and if x is in a then [5x/3] and [7x/3] are in a, where [ ]=floor.
 * @author Georg Fischer
 */
public class A191328 extends A190803 {

  @Override
  public void insertTerms(final Z x) {
    insert(x.multiply(5).divide(3));
    insert(x.multiply(7).divide(3));
  }

}
