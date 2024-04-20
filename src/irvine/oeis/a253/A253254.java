package irvine.oeis.a253;
// manually knest/jaguar at 2023-03-01 16:41

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a051.A051682;

/**
 * A253254 Largest prime factor of the n-th 11-gonal number.
 * @author Georg Fischer
 */
public class A253254 extends AbstractSequence {

  private final A051682 mSeq1 = new A051682();

  /** Construct the sequence. */
  public A253254() {
    super(2);
  }

  {
    mSeq1.next();
    mSeq1.next();
  }

  @Override
  public Z next() {
    return Functions.GPF.z(mSeq1.next());
  }
}
