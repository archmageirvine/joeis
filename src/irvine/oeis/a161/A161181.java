package irvine.oeis.a161;
// Generated by gen_seq4.pl dersimple at 2022-12-15 23:30

import irvine.math.z.Z;
import irvine.oeis.a117.A117805;

/**
 * A161181 A117805/3.
 * @author Georg Fischer
 */
public class A161181 extends A117805 {

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}
