package irvine.oeis.a057;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000010;
import irvine.oeis.a001.A001221;

/**
 * A057859 Number of residue classes modulo n which contain a prime.
 * @author Georg Fischer
 */
public class A057859 extends Sequence1 {

  final Sequence mA000010 = new A000010();
  final Sequence mA001221 = new A001221();
  @Override
  public Z next() {
    return mA000010.next().add(mA001221.next());
  }

}
