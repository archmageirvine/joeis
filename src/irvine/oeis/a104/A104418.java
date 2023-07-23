package irvine.oeis.a104;
// manually knest/jaguarz at 2023-03-01 16:41

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A104418 Number of prime factors, with multiplicity, of the nonzero 9-acci numbers.
 * @author Georg Fischer
 */
public class A104418 extends AbstractSequence {

  private final A104144 mSeq1 = new A104144();

  /** Construct the sequence. */
  public A104418() {
    super(1);
  }

  {
    for (int i = 0; i < 8; ++i) {
      mSeq1.next();
    }
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(mSeq1.next()).bigOmega());
  }
}
