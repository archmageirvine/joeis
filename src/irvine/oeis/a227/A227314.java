package irvine.oeis.a227;
// manually knest/jaguarz at 2023-03-13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a053.A053767;

/**
 * A227314 Number of prime factors, with multiplicity, of sum of first n composite numbers.
 * @author Georg Fischer
 */
public class A227314 extends Sequence1 {

  private final Sequence mSeq = new A053767().skip();

  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(mSeq.next());
  }
}
