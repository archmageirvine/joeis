package irvine.oeis.a095;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001359;
import irvine.oeis.a006.A006512;

/**
 * A095958 Twin prime pairs concatenated in decimal representation.
 * @author Georg Fischer
 */
public class A095958 extends Sequence1 {

  private final A001359 mSeq1 = new A001359();
  private final A006512 mSeq2 = new A006512();

  @Override
  public Z next() {
    return new Z(mSeq1.next().toString() + mSeq2.next().toString());
  }
}
