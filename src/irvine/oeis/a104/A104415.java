package irvine.oeis.a104;
// manually knest/jaguarz at 2023-03-01 16:41

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a079.A079262;

/**
 * A104415 Number of prime factors, with multiplicity, of the nonzero octanacci numbers A079262.
 * @author Georg Fischer
 */
public class A104415 extends AbstractSequence {

  private final A079262 mSeq1 = new A079262();

  /** Construct the sequence. */
  public A104415() {
    super(1);
  }

  {
    for (int i = 0; i < 7; ++i) {
      mSeq1.next();
    }
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(mSeq1.next()).bigOmega());
  }
}
