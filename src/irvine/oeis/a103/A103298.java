package irvine.oeis.a103;
// Generated by gen_seq4.pl dersimple at 2021-08-25 22:45

import irvine.math.z.Z;
import irvine.oeis.a046.A046693;

/**
 * A103298 Number of segments of a perfect ruler with length n.
 * @author Georg Fischer
 */
public class A103298 extends A046693 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
