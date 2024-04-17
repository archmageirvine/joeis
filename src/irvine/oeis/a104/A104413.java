package irvine.oeis.a104;
// manually knest/jaguarz at 2023-03-01 16:41

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001592;

/**
 * A104413 Number of prime factors, with multiplicity, of the hexanacci numbers A001592.
 * @author Georg Fischer
 */
public class A104413 extends AbstractSequence {

  private final A001592 mSeq1 = new A001592();

  /** Construct the sequence. */
  public A104413() {
    super(5);
  }

  {
    for (int i = 0; i < 5; ++i) {
      mSeq1.next();
    }
  }

  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(mSeq1.next());
  }
}
