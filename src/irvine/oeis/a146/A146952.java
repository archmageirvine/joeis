package irvine.oeis.a146;
// Generated by gen_seq4.pl divmul at 2021-08-20 23:57

import irvine.math.z.Z;

/**
 * A146952 a(n) = A146950(n)/40.
 * @author Georg Fischer
 */
public class A146952 extends A146950 {

  @Override
  public Z next() {
    return super.next().divide(40);
  }
}
